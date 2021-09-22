import java.util.Date;

public class App {
    public static void main(String[] args){

        Etudiants etu1 = new Etudiants();
        etu1.setIne("AA1111");
        etu1.setNom("Dupont");
        etu1.setPrenom("Jean");
        etu1.setAdresseMail("jean.dupont@mail.fr");
        etu1.setAdressePostale("123 Rue de qqch");
        System.out.println(etu1.toString());

        Etudiants etu2 = new Etudiants();
        etu2.setIne("AA2222");
        etu2.setNom("Durand");
        etu2.setPrenom("Arthur");
        etu2.setAdresseMail("arthur.durand@mail.com");
        etu2.setAdressePostale("456 Rue de qqch");
        System.out.println(etu2.toString());

        Enseignants ens1 = new Enseignants();
        ens1.setHarpege(100);
        ens1.setNumem(10);
        ens1.setNom("Durant");
        ens1.setPrenom("Claude");
        ens1.setAdresseMail("claude.durant@mail.com");
        ens1.setAdressePostale("123 avenue de qqch");
        System.out.println(ens1.toString());

        Enseignants ens2 = new Enseignants();
        ens2.setHarpege(101);
        ens2.setNumem(11);
        ens2.setNom("Dupond");
        ens2.setPrenom("Claudette");
        ens2.setAdresseMail("claudette.dupond@mail.fr");
        ens2.setAdressePostale("456 avenue de qqch");
        System.out.println(ens2.toString());

        Cours c1 = new Cours();
        c1.setCDC(ens1);
        c1.setNom("cours");
        c1.setSemestre(3);
        System.out.println(c1.toString());

        Devoirs d1 = new Devoirs();
        d1.setNom("devoir1");
        d1.setDescription("faire devoir");
        d1.setPoints(20);
        System.out.println(d1.toString());

        Devoirs d2 = new Devoirs();
        d2.setNom("devoir2");
        d2.setDescription("faire le devoir");
        d2.setPoints(10);
        System.out.println(d2.toString());



    }
}
