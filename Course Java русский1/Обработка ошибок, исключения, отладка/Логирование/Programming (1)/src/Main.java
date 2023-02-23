
import java.util.logging.Logger;

/*
Интерфейс: сущность, которую можно отправить по почте.
У такой сущности можно получить от кого и кому направляется письмо.
*/
public static interface Sendable {
    String getFrom();
    String getTo();
}


/*
Абстрактный класс,который позволяет абстрагировать логику хранения
источника и получателя письма в соответствующих полях класса.
*/
public static abstract class AbstractSendable implements Sendable {

    protected final String from;
    protected final String to;

    public AbstractSendable(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractSendable that = (AbstractSendable) o;

        if (!from.equals(that.from)) return false;
        if (!to.equals(that.to)) return false;

        return true;
    }

}


/*
Письмо, у которого есть текст, который можно получить с помощью метода `getMessage`
*/
public static class MailMessage extends AbstractSendable {

    private final String message;

    public MailMessage(String from, String to, String message) {
        super(from, to);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MailMessage that = (MailMessage) o;

        if (message != null ? !message.equals(that.message) : that.message != null) return false;

        return true;
    }

}

/*
Посылка, содержимое которой можно получить с помощью метода `getContent`
*/
public static class MailPackage extends AbstractSendable {
    private final Package content;

    public MailPackage(String from, String to, Package content) {
        super(from, to);
        this.content = content;
    }

    public Package getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MailPackage that = (MailPackage) o;

        if (!content.equals(that.content)) return false;

        return true;
    }

}


/*
Класс, который задает посылку. У посылки есть текстовое описание содержимого и целочисленная ценность.
*/
public static class Package {
    private final String content;
    private final int price;

    public Package(String content) {
        this.content = content;
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Package aPackage = (Package) o;

        if (price != aPackage.price) return false;
        if (!content.equals(aPackage.content)) return false;

        return true;
    }
}

/*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/
public static interface MailService {
    Sendable processMail(Sendable mail);
}

/*
Класс, в котором скрыта логика настоящей почты
*/
public static class RealMailService implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        // Здесь описан код настоящей системы отправки почты.
        return mail;
    }
}



// implement UntrustworthyMailWorker, Spy, Inspector, Thief,
// StolenPackageException, IllegalPackageException as public static classes here
public class Main {
    
}

public static class UntrustworthyMailWorker implements MailService{
    private static MailService[] workers;
    private static RealMailService realWorker = new RealMailService();

    UntrustworthyMailWorker(MailService[] w) {
        workers = w;
    }

    public  RealMailService getRealMailService() {
        return realWorker;
    }

    @Override
    public Sendable processMail(Sendable mail){
        Sendable process = mail;
        for (int i = 0; i < workers.length; i++)
            workers[i].processMail(process);
        return realWorker.processMail(mail);
    }
}

public static class Spy implements MailService{
    private Logger logger;

    public Spy(Logger l) {
        logger = l;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        MailMessage mailMessage = (MailMessage) mail;
        String from = mailMessage.getFrom();
        String to = mailMessage.getTo();
        if (from.equals("Austin Powers") || to.equals("Austin Powers"))
        {
            logger.warning("Detected target mail correspondence from " + from + " to " + to + "\"" + mailMessage.getMessage() + "\"");
        }
        else logger.info("Usual correspondence: from " +from + " to " + to);
        return mail;
    }
}

public static class IllegalPackageException extends RuntimeException {
    public IllegalPackageException() {
    }
}

public static class StolenPackageException extends RuntimeException {
    public StolenPackageException() {
    }
}

public static class Inspector implements MailService{

    @Override
    public Sendable processMail(Sendable mail) {
        public static final String BANNED_SUBSTANCE = "banned substance";
        public static final String WEAPONS = "weapons";
        if (mail.getClass() == MailPackage.class)
        {
            if (((MailPackage) mail).getContent().equals(WEAPONS) || ((MailPackage) mail).getContent().equals(BANNED_SUBSTANCE))
                throw new IllegalPackageException();
            if (((MailPackage) mail).getContent().toString().indexOf("stones instead of ") == 0)
                throw new StolenPackageException();
        }
        return mail;
    }
}

public static class Thief implements MailService {
    private int minPrice = 0;
    private int stolenPrice = 0;
    public Thief(int minPrice){
        this.minPrice = minPrice;
    }
    public int getStolenValue(){
        return stolenPrice;
    }
    @Override
    public Sendable processMail(Sendable mail) {
        if(mail.getClass() == MailPackage.class) {
            Package pac = ((MailPackage)mail).getContent();
            if(pac.getPrice() >= minPrice){
                stolenPrice += pac.getPrice();
                mail = new MailPackage(mail.getFrom(), mail.getTo(),new Package("stones instead of " + pac.getContent(), 0));
            }
        }
        return mail;
    }
}
