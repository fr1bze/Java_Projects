class RobotConnectionException extends RuntimeException {

    public RobotConnectionException(String message) {
        super(message);

    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}


public class Main extends RobotMovement implements RobotConnection, RobotConnectionManager{
    static Robot robot = new Robot();
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw new RobotConnectionException("Error");
                }
            }
        }
    }

    @Override
    public void moveRobotTo(int x, int y) {
        RobotMovement.moveRobot(robot,x,y);
    }

    @Override
    public void close() {
        System.out.println("Connection got command to close");
    }

    @Override
    public RobotConnection getConnection() {
        RobotConnection robotConnection = null;
        return robotConnection;
    }

    public static void main(String[] args) {
        moveRobot(robot,3,5);
    }
}
