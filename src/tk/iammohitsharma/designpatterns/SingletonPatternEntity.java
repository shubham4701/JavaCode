package tk.iammohitsharma.designpatterns;

class SingletonPatternEntity {

    private static SingletonPatternEntity object = null;
    private SingletonPatternEntity() {}

    static SingletonPatternEntity getInstance() {
        if(object == null) {
            synchronized (SingletonPatternEntity.class) {
                if(object == null) {
                    object = new SingletonPatternEntity();
                }
            }
        }
        return object;
    }
}
