public class Parks{
    Stirng neighbourhood, name, category, streetName, streetNumber;

    public Parks(String name, String category, String streetName, String streetNumber, String neighbourhood){
        this.name = name;
        this.category = category;
        this. streetName = streetName;
        this.streetNumber = streetNumber;
        this. neighbourhood = neighbourhood;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public String getStreetName(){
        return streetName;
    }

    public String getStreetNumber(){
        return streetNumber;
    }

    public String getNeighbourhood(){
        return neighbourhood;
    }
}