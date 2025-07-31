public enum Department {
    NONE("No Department"),
    CSCI("Computer Science"),
    CHEM("Chemistry"),
    PHYSICS("Physics"),
    BIO("Biology"),
    GEO("Geography");
    
    //enums define a fixed set of constant values

    private String name;

    private Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}