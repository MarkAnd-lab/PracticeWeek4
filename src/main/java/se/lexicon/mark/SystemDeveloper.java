package se.lexicon.mark;

/*
 SystemDevelopers get 1000 extra for each certificate they have
 and 1500 extra for each programming language they work with.
*/

public class SystemDeveloper extends Employee {
    private String[] certificates = new String[0];
    private String[] languages = new String[0];


    public SystemDeveloper(String namePrivate, double salery, String cert) {
        super(namePrivate, salery);

    }
@Override
    public void calculateSalary() {
        double certrificationsBonus = 1000;
        double programmingLanguage = 1500;
        if (getSalary()!= 25000) {
            setSalary(25000);
            }
        setSalary(getSalary() + (certrificationsBonus * certificates.length) + (programmingLanguage * languages.length));

    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

@Override
            public String toString () {
            return "";
        }

}

//make a toString implementation for SystemDevelopers and SalesPerson