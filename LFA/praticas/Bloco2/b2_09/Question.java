import java.util.Arrays;

class Question {
    String question, id1, id2;
    String[] answers;
    Integer[] points;

    public Question(String question, String id1, String[] answers, Integer[] points) {
        this.question = question;
        this.id1 = id1;
        this.answers = answers;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", id1='" + id1 + '\'' +
                ", answers=" + Arrays.toString(answers) +
                ", points=" + Arrays.toString(points) +
                '}';
    }
}
