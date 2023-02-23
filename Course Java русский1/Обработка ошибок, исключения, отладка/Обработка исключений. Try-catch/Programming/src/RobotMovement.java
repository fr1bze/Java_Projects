class Robot {
    int x = 0;
    int y = 0;
    Direction direction = Direction.UP;

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        System.out.println("Поворот против часовой стрелки");
        if (direction == Direction.DOWN) {
            this.direction = Direction.RIGHT;
            return;
        }

        if (direction == Direction.UP) {
            this.direction = Direction.LEFT;
            return;
        }

        if (direction == Direction.LEFT) {
            this.direction = Direction.DOWN;
            return;
        }

        if (direction == Direction.RIGHT) {
            this.direction = Direction.UP;
            return;
        }
    }

    public void turnRight() {
        System.out.println("поворот по часовой стрелке");
        if (this.direction == Direction.DOWN) {
            System.out.println("Вниз -> влево");
            this.direction = Direction.LEFT;
            return;
        }

        if (this.direction == Direction.UP) {
            System.out.println("Вверх -> вправо");
            this.direction = Direction.RIGHT;
            return;
        }

        if (this.direction == Direction.LEFT) {
            System.out.println("Влево -> вверх");
            this.direction = Direction.UP;
            return;
        }

        if (this.direction == Direction.RIGHT) {
            System.out.println("Вправо -> вниз");
            this.direction = Direction.DOWN;
            return;
        }
    }

    public void stepForward() {
        System.out.println("движение");
        if (direction == Direction.DOWN) {
            System.out.println("вниз");
            this.y--;
        }

        if (direction == Direction.UP) {
            System.out.println("вверх");
            this.y++;
        }

        if (direction == Direction.LEFT) {
            System.out.println("налево");
            this.x--;
        }

        if (direction == Direction.RIGHT) {
            System.out.println("направо");
            this.x++;
        }
    }
}
enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

public class RobotMovement {
    public static void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        Direction dir = robot.getDirection();
        if (x < toX) {
            turnTo(robot, Direction.RIGHT);
            while (x != toX) {
                robot.stepForward();
                x = robot.getX();
            }
        } else if (x > toX) {
            turnTo(robot, Direction.LEFT);
            while (x != toX) {
                robot.stepForward();
                x = robot.getX();
            }
        }
        if (y < toY) {
            turnTo(robot, Direction.UP);
            while (y != toY) {
                robot.stepForward();
                y = robot.getY();
            }
        } else if (y > toY) {
            turnTo(robot, Direction.DOWN);
            while (y != toY) {
                robot.stepForward();
                y = robot.getY();
            }
        }
    }

    public static void turnTo(Robot robot, Direction dir) {
        while (robot.getDirection() != dir)
            robot.turnRight();
    }
}