import java.util.ArrayList;

public class Statistics {
    private ArrayList<Integer> points;

    public Statistics() {
        points = new ArrayList<>();
    }

    public void addPoint(int point) {
        if (point >= 0 && point <= 100) {
            points.add(point);
        }
    }

    public double getAvg() {
        if (points.size() == 0) {
            return 0.0;
        }

        int total = 0;

        for (Integer i : points) {
            total += i;
        }

        return (double) total / points.size();
    }

    public double getPassingAvg() {
        if (points.size() == 0) {
            return 0.0;
        }

        int total = 0;
        int count = 0;

        for (Integer i : points) {
            if (i >= 50) {
                total += i;
                count++;
            }
        }

        if (count == 0) {
            return 0.0;
        }

        return (double) total / count;
    }

    public double getPassPercentage() {
        if (points.size() == 0) {
            return 0.0;
        }

        int count = 0;

        for (int i : points) {
            if (i >= 50) {
                count++;
            }
        }

        return (double) count / points.size() * 100;
    }

    public int[] getGrade() {
        int[] grades = new int[6];

        for (int point : points) {
            if (point < 50) {
                grades[0]++;
                continue;
            }

            if (point < 60) {
                grades[1]++;
                continue;
            }

            if (point < 70) {
                grades[2]++;
                continue;
            }

            if (point < 80) {
                grades[3]++;
                continue;
            }

            if (point < 90) {
                grades[4]++;
                continue;
            }

            if (point <= 100) {
                grades[5]++;
                continue;
            }
        }

        return grades;
    }

    public void printGrades() {
        int[] grades = getGrade();

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
