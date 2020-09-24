package com.company;

public class Main {

    // In essence, polymorphism is the utilisation of the same
    // functionality shared by many different classes.
    // So, below, all the classes for individual movies have a plot
    // method and, despite not having one, ForgettableMovie can
    // default to the plot method in the Movie class parent.

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " is " + movie.getName() + "." + "\nPlot: " + movie.plot());
        }
    }

    public static Movie randomMovie() {
        int random = (int) (Math.random() * 5) + 1;

        System.out.println("Random no = " + random);

        switch (random) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new BladeRunner();
            case 4:
                return new GalaxyQuest();
            case 5:
                return new ForgettableMovie();
            default:
                return null;
        }

    }
}

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No plot here.";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people.";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to destroy Earth.";
    }
}

class BladeRunner extends Movie {

    public BladeRunner() {
        super("Blade Runner");
    }

    @Override
    public String plot() {
        return("Investigator tracks down renegade human clones.");
    }
}

class GalaxyQuest extends Movie {

    public GalaxyQuest() {
        super("Galaxy Quest");
    }

    @Override
    public String plot() {
        return "Serial Star Trek-like series turns out to be real.";
    }
}

class ForgettableMovie extends Movie {

    public ForgettableMovie() {
        super("Forgettable");
    }

    // No plot method
}

