import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {

    private String username;
    private int age;
    private String sex;
    private List<String> courses;
    private Map<String, String> hashMap;
    private boolean flag;
    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHashMap(Map<String, String> hashMap) {
        this.hashMap = hashMap;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }


    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", courses=" + courses +
                ", hashMap=" + hashMap +
                '}';
    }
}
