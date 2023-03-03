package ObrabotkaOshibok;

import Interface.Workers;

public class Company {
    String name;
    Worker director;

    public Company() {
        this.name = "no name";
        this.director=null;
    }

    public Company(String name, Worker director) {
        this.name = name;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        try {
            return "Company name:" + " " + name+"."+" Information about director ->"+" "+director.name+" "+director.surname+".";
        } catch (NullPointerException e) {
         return "Data not found";
        }
    }
}
