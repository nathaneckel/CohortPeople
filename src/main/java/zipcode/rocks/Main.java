package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "cohortData.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

        List listOfStudents = programObject.loadCSVFile(student_source);

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }
    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }

    private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.
        String[] values = line.split(COMMA_DELIMITER);
        Person newPerson = new Person(values[0], values[1], values[2], values[3], values[4], values[5]);
        return newPerson;
    }

    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<Person>();

        Person newPerson = new Person("Abukar", "Abukar", handle, "abukarabukar", color, "yellow");
        newPerson.setHandle("abukarabukar");
        newPerson.setColor("yellow");
        newPerson.setMonth("April");
        newPerson.setPet("true");
        record.add(newPerson);

        Person newPerson = new Person("Chaz", "Adams");
        newPerson.setGithubHandle("chaz_adams");
        newPerson.setFavoriteColor("blue");
        newPerson.setBirthMonth("February");
        newPerson.setLikePets("true");
        record.add(newPerson);

        Person newPerson = new Person("Asan", "Ahmadli,");
        newPerson.setGithubHandle("asanahamdli");
        newPerson.setFavoriteColor("blue");
        newPerson.setBirthMonth("December");
        newPerson.setHasPets("false");
        record.add(newPerson);

        Person newPerson = new Person("Jenn", "Azer");
        newPerson.setGithubHandle("cupofjavajenny");
        newPerson.setFavoriteColor("blue");
        newPerson.setBirthMonth("November");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Ali", "Bangash");
        newPerson.setGithubHandle("ali-b14");
        newPerson.setFavoriteColor("green");
        newPerson.setBirthMonth("March");
        newPerson.setHasPets("false");
        record.add(newPerson);

        Person newPerson = new Person("Jake", "Brennan");
        newPerson.setGithubHandle("jake-brennan714");
        newPerson.setFavoriteColor("purple");
        newPerson.setBirthMonth("April");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Trey", "Bruton");
        newPerson.setGithubHandle("tb0902_");
        newPerson.setFavoriteColor("orange");
        newPerson.setBirthMonth("September");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Danny", "Cao");
        newPerson.setGithubHandle("dannycao1997");
        newPerson.setFavoriteColor("September");
        newPerson.setBirthMonth("March");
        newPerson.setHasPets("false");
        record.add(newPerson);

        Person newPerson = new Person("Nathan", "Eckel");
        newPerson.setGithubHandle("nathaneckel");
        newPerson.setFavoriteColor("green");
        newPerson.setBirthMonth("February");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Jorris", "Ekoloko");
        newPerson.setGithubHandle("reeseyverse");
        newPerson.setFavoriteColor("black");
        newPerson.setBirthMonth("August");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Alice", "Gonzalez");
        newPerson.setGithubHandle("NEEDGITHUB");
        newPerson.setFavoriteColor("blue");
        newPerson.setBirthMonth("May");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Deepa", "Kakade");
        newPerson.setGithubHandle("NEEDGITHUB");
        newPerson.setFavoriteColor("pink");
        newPerson.setBirthMonth("June");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Mariyana", "Katzarova");
        newPerson.setGithubHandle("mariyana-katz");
        newPerson.setFavoriteColor("green");
        newPerson.setBirthMonth("December");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Lydia", "Konstanski");
        newPerson.setGithubHandle("lydiastonekonstanski");
        newPerson.setFavoriteColor("black");
        newPerson.setBirthMonth("October");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Matt", "Kramer");
        newPerson.setGithubHandle("NEEDGITHUB");
        newPerson.setFavoriteColor("green");
        newPerson.setBirthMonth("January");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Angelina", "Mathew");
        newPerson.setGithubHandle("angelinamathew");
        newPerson.setFavoriteColor("blue");
        newPerson.setBirthMonth("May");
        newPerson.setHasPets("false");
        record.add(newPerson);

        Person newPerson = new Person("Chris", "McCall");
        newPerson.setGithubHandle("christopher_mccall");
        newPerson.setFavoriteColor("blue");
        newPerson.setBirthMonth("May");
        newPerson.setHasPets("false");
        record.add(newPerson);

        Person newPerson = new Person("Nick", "McNamara");
        newPerson.setGithubHandle("nicholasmacnamara");
        newPerson.setFavoriteColor("green");
        newPerson.setBirthMonth("January");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Shaily", "Modi");
        newPerson.setGithubHandle("*NEED");
        newPerson.setFavoriteColor("*NEED");
        newPerson.setBirthMonth("*NEED");
        newPerson.setHasPets("*NEED");
        record.add(newPerson);

        Person newPerson = new Person("Dan", "Moffett-Conaway");
        newPerson.setGithubHandle("moffd234");
        newPerson.setFavoriteColor("blue");
        newPerson.setBirthMonth("June");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Lavanya", "Palanikumar");
        newPerson.setGithubHandle("lavanyapalanikumar93");
        newPerson.setFavoriteColor("blue");
        newPerson.setBirthMonth("October");
        newPerson.setHasPets("false");
        record.add(newPerson);

        Person newPerson = new Person("Anthony", "Pearson");
        newPerson.setGithubHandle("anthonyp365");
        newPerson.setFavoriteColor("red");
        newPerson.setBirthMonth("July");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Ethan", "Rieger");
        newPerson.setGithubHandle("erieger11");
        newPerson.setFavoriteColor("blue");
        newPerson.setBirthMonth("May");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Jorden", "Ross");
        newPerson.setGithubHandle("jross911");
        newPerson.setFavoriteColor("green");
        newPerson.setBirthMonth("December");
        newPerson.setHasPets("false");
        record.add(newPerson);

        Person newPerson = new Person("Michael", "Scott");
        newPerson.setGithubHandle("michaelscott44");
        newPerson.setFavoriteColor("orange");
        newPerson.setBirthMonth("May");
        newPerson.setHasPets("true");
        record.add(newPerson);

        Person newPerson = new Person("Diksha", "Sharma");
        newPerson.setGithubHandle("dikshasharmaa");
        newPerson.setFavoriteColor("blue");
        newPerson.setBirthMonth("March");
        newPerson.setHasPets("false");
        record.add(newPerson);

        Person newPerson = new Person("Shijin", "Zeng");
        newPerson.setGithubHandle("szeng89");
        newPerson.setFavoriteColor("yellow");
        newPerson.setBirthMonth("July");
        newPerson.setHasPets("false");
        record.add(newPerson);

        Person newPerson = new Person("Andy", "Zheng");
        newPerson.setGithubHandle("andyzheng679");
        newPerson.setFavoriteColor("red");
        newPerson.setBirthMonth("December");
        newPerson.setHasPets("false");
        record.add(newPerson);

        return students;
    }
}
