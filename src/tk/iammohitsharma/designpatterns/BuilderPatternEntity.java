package tk.iammohitsharma.designpatterns;

public class BuilderPatternEntity {

    private String name;
    private int age;
    private String city;


    BuilderPatternEntity(BuilderPatternHelper helper) {
        this.name = helper.name;
        this.age = helper.age;
        this.city = helper.city;
    }

    @Override
    public String toString() {
        return "BuilderPatternEntity{" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", City='" + city + '\'' +
                '}';
    }

    static class BuilderPatternHelper {

        private String name;
        private int age;
        private String city;

        BuilderPatternHelper() {}

        BuilderPatternHelper setName(String name) {
            this.name = name;
            return this;
        }

        BuilderPatternHelper setAge(int age) {
            this.age = age;
            return this;
        }

        BuilderPatternHelper setCity(String city) {
            this.city = city;
            return this;
        }

        BuilderPatternEntity getInstance() {
            return new BuilderPatternEntity(this);
        }
    }
}
