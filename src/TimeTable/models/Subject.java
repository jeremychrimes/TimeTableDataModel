package TimeTable.models;

public class Subject {
    private String name;
    private String shortname;
    private String teacher;
    private String colour;

    public Subject(String name, String shortname, String teacher) {
        this.name = name;
        this.shortname = shortname;
        this.teacher = teacher;
        this.colour = "purple";
    }

    public Subject() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        String line = String.join(",", shortname, name, teacher);
        return line;
    }
}
