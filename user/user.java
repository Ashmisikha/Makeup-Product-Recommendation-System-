public class User {
    private String name;
    private String skinTone;
    private String skinType;

    public User(String name, String skinTone, String skinType) {
        this.name = name;
        this.skinTone = skinTone;
        this.skinType = skinType;
    }

    public String getSkinTone() { return skinTone; }
    public String getSkinType() { return skinType; }
}
