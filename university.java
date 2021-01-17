package GUI;

public class university {
    
    private String name;
    private String location;
    private int rank;
    private int subjectRank [] = new int [22];
            
    public university () {
        name = "";
    }
    
    public university (int rank, String name, String location) {
        this.rank = rank;
        this.name = name;
        this.location = location;
        for (int i = 0; i < subjectRank.length; i++) {
            subjectRank[i] = 9999;
        }
    }
    
    public int getRanking () {
        return rank;
    }
    
    public int getSubRank (int sub) {
        return subjectRank[sub];
    }
    
    public String getName () {
        return name;
    }
    
    public void setSubRank (int sub, int rank) {
        subjectRank[sub] = rank;
    }
    
    public String getLocation () {
        return location;
    }
    
}