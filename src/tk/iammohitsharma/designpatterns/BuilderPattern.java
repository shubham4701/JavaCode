package tk.iammohitsharma.designpatterns;

public class BuilderPattern {
    public static void main(String[] args) {
        BuilderPatternEntity.BuilderPatternHelper helper = new BuilderPatternEntity.BuilderPatternHelper();
        BuilderPatternEntity entity = helper.setAge(15)
                                        .setCity("Romania")
                                        .setName("Allens")
                                        .getInstance();
        System.out.println(entity.toString());
    }
}
