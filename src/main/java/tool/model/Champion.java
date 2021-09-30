package tool.model;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Champion {
    private final String name;
    private final Lane lane;
    private final BigDecimal weight;
    private BigDecimal summedWeight;

    public Champion() {
        name = "";
        lane = null;
        weight = new BigDecimal("0.0");
        summedWeight = new BigDecimal("0.0");
    }

    public Champion(String name, Lane lane, BigDecimal weight) {
        this.name = name;
        this.lane = lane;
        this.weight = weight;
        summedWeight = weight;
    }

    private static List<Champion> champions() {
        List<Champion> liste = new LinkedList<>();
        liste.add(new Champion("Aatrox", Lane.TOP, new BigDecimal("10.35")));
        liste.add(new Champion("Ekko", Lane.JGL, new BigDecimal("4.83")));
        liste.add(new Champion("Ekko", Lane.MID, new BigDecimal("3.22")));
        liste.add(new Champion("Jinx", Lane.ADC, new BigDecimal("25.74")));
        liste.add(new Champion("Miss Fortune", Lane.ADC, new BigDecimal("2.27")));
        liste.add(new Champion("Shen", Lane.TOP, new BigDecimal("4.17")));
        liste.add(new Champion("Shen", Lane.SUPP, new BigDecimal("0.67")));
        liste.add(new Champion("Varus", Lane.ADC, new BigDecimal("5.97")));
        liste.add(new Champion("Ahri", Lane.MID, new BigDecimal("4.87")));
        liste.add(new Champion("Elise", Lane.JGL, new BigDecimal("12.40")));
        liste.add(new Champion("Kalista", Lane.TOP, new BigDecimal("0.67")));
        liste.add(new Champion("Kalista", Lane.ADC, new BigDecimal("2.03")));
        liste.add(new Champion("Mordekaiser", Lane.TOP, new BigDecimal("4.35")));
        liste.add(new Champion("Shyvana", Lane.JGL, new BigDecimal("0.75")));
        liste.add(new Champion("Vayne", Lane.TOP, new BigDecimal("2.27")));
        liste.add(new Champion("Vayne", Lane.ADC, new BigDecimal("9.89")));
        liste.add(new Champion("Akali", Lane.TOP, new BigDecimal("7.46")));
        liste.add(new Champion("Akali", Lane.MID, new BigDecimal("7.45")));
        liste.add(new Champion("Evelynn", Lane.JGL, new BigDecimal("3.33")));
        liste.add(new Champion("Karma", Lane.SUPP, new BigDecimal("5.57")));
        liste.add(new Champion("Morgana", Lane.SUPP, new BigDecimal("6.9")));
        liste.add(new Champion("Singed", Lane.TOP, new BigDecimal("1.41")));
        liste.add(new Champion("Veigar", Lane.MID, new BigDecimal("0.89")));
        liste.add(new Champion("Veigar", Lane.SUPP, new BigDecimal("0.59")));
        liste.add(new Champion("Alistar", Lane.SUPP, new BigDecimal("13.05")));
        liste.add(new Champion("Ezreal", Lane.ADC, new BigDecimal("20.59")));
        liste.add(new Champion("Karthus", Lane.JGL, new BigDecimal("4.9")));
        liste.add(new Champion("Nami", Lane.SUPP, new BigDecimal("1.52")));
        liste.add(new Champion("Sion", Lane.TOP, new BigDecimal("4.53")));
        liste.add(new Champion("Sion", Lane.MID, new BigDecimal("0.57")));
        liste.add(new Champion("Vel’Koz", Lane.SUPP, new BigDecimal("1.29")));
        liste.add(new Champion("Amumu", Lane.JGL, new BigDecimal("0.92")));
        liste.add(new Champion("Fiddlesticks", Lane.JGL, new BigDecimal("3.5")));
        liste.add(new Champion("Kassadin", Lane.MID, new BigDecimal("2.86")));
        liste.add(new Champion("Nasus", Lane.TOP, new BigDecimal("2.48")));
        liste.add(new Champion("Sivir", Lane.ADC, new BigDecimal("5.48")));
        liste.add(new Champion("Vi", Lane.JGL, new BigDecimal("1.52")));
        liste.add(new Champion("Anivia", Lane.MID, new BigDecimal("3.57")));
        liste.add(new Champion("Anivia", Lane.SUPP, new BigDecimal("0.62")));
        liste.add(new Champion("Fiora", Lane.TOP, new BigDecimal("7.61")));
        liste.add(new Champion("Katarina", Lane.MID, new BigDecimal("8.41")));
        liste.add(new Champion("Nautilus", Lane.SUPP, new BigDecimal("7.8")));
        liste.add(new Champion("Skarner", Lane.JGL, new BigDecimal("0.99")));
        liste.add(new Champion("Viktor", Lane.TOP, new BigDecimal("0.6")));
        liste.add(new Champion("Viktor", Lane.MID, new BigDecimal("5.8")));
        liste.add(new Champion("Annie", Lane.MID, new BigDecimal("1.23")));
        liste.add(new Champion("Fizz", Lane.MID, new BigDecimal("4.12")));
        liste.add(new Champion("Kayle", Lane.TOP, new BigDecimal("0.88")));
        liste.add(new Champion("Nidalee", Lane.JGL, new BigDecimal("14.12")));
        liste.add(new Champion("Sona", Lane.SUPP, new BigDecimal("0.67")));
        liste.add(new Champion("Vladimir", Lane.TOP, new BigDecimal("1.72")));
        liste.add(new Champion("Vladimir", Lane.MID, new BigDecimal("1.71")));
        liste.add(new Champion("Ashe", Lane.ADC, new BigDecimal("5.25")));
        liste.add(new Champion("Galio", Lane.MID, new BigDecimal("5.93")));
        liste.add(new Champion("Galio", Lane.SUPP, new BigDecimal("3.43")));
        liste.add(new Champion("Kennen", Lane.TOP, new BigDecimal("1.75")));
        liste.add(new Champion("Nocturne", Lane.TOP, new BigDecimal("0.79")));
        liste.add(new Champion("Nocturne", Lane.JGL, new BigDecimal("2.49")));
        liste.add(new Champion("Nocturne", Lane.MID, new BigDecimal("1.67")));
        liste.add(new Champion("Soraka", Lane.SUPP, new BigDecimal("2.57")));
        liste.add(new Champion("Volibear", Lane.TOP, new BigDecimal("4.87")));
        liste.add(new Champion("Volibear", Lane.JGL, new BigDecimal("4.34")));
        liste.add(new Champion("Aurelion Sol", Lane.MID, new BigDecimal("0.69")));
        liste.add(new Champion("Gangplank", Lane.TOP, new BigDecimal("4.06")));
        liste.add(new Champion("Kha’Zix", Lane.JGL, new BigDecimal("4.48")));
        liste.add(new Champion("Nunu", Lane.JGL, new BigDecimal("3.8")));
        liste.add(new Champion("Nunu", Lane.MID, new BigDecimal("0.74")));
        liste.add(new Champion("Swain", Lane.ADC, new BigDecimal("0.99")));
        liste.add(new Champion("Swain", Lane.SUPP, new BigDecimal("2.56")));
        liste.add(new Champion("Warwick", Lane.TOP, new BigDecimal("1.11")));
        liste.add(new Champion("Warwick", Lane.JGL, new BigDecimal("1.98")));
        liste.add(new Champion("Azir", Lane.MID, new BigDecimal("1.22")));
        liste.add(new Champion("Garen", Lane.TOP, new BigDecimal("3.63")));
        liste.add(new Champion("Garen", Lane.MID, new BigDecimal("0.95")));
        liste.add(new Champion("Kindred", Lane.JGL, new BigDecimal("7.55")));
        liste.add(new Champion("Olaf", Lane.JGL, new BigDecimal("3.29")));
        liste.add(new Champion("Syndra", Lane.MID, new BigDecimal("2.11")));
        liste.add(new Champion("Wukong", Lane.TOP, new BigDecimal("3.17")));
        liste.add(new Champion("Bard", Lane.SUPP, new BigDecimal("3.75")));
        liste.add(new Champion("Gnar", Lane.TOP, new BigDecimal("9.98")));
        liste.add(new Champion("Kled", Lane.TOP, new BigDecimal("2.11")));
        liste.add(new Champion("Kled", Lane.MID, new BigDecimal("0.64")));
        liste.add(new Champion("Orianna", Lane.MID, new BigDecimal("5.34")));
        liste.add(new Champion("Tahm Kench", Lane.ADC, new BigDecimal("0.63")));
        liste.add(new Champion("Xerath", Lane.MID, new BigDecimal("1.33")));
        liste.add(new Champion("Xerath", Lane.SUPP, new BigDecimal("3.94")));
        liste.add(new Champion("Blitzcrank", Lane.SUPP, new BigDecimal("11.73")));
        liste.add(new Champion("Gragas", Lane.TOP, new BigDecimal("2.65")));
        liste.add(new Champion("Gragas", Lane.JGL, new BigDecimal("2.58")));
        liste.add(new Champion("Gragas", Lane.SUPP, new BigDecimal("2.64")));
        liste.add(new Champion("Kog’Maw", Lane.ADC, new BigDecimal("1.13")));
        liste.add(new Champion("Pantheon", Lane.TOP, new BigDecimal("0.91")));
        liste.add(new Champion("Pantheon", Lane.MID, new BigDecimal("4.15")));
        liste.add(new Champion("Pantheon", Lane.SUPP, new BigDecimal("3.09")));
        liste.add(new Champion("Taliyah", Lane.JGL, new BigDecimal("3.73")));
        liste.add(new Champion("Brand", Lane.SUPP, new BigDecimal("1.53")));
        liste.add(new Champion("Graves", Lane.JGL, new BigDecimal("11.62")));
        liste.add(new Champion("LeBlanc", Lane.MID, new BigDecimal("4.87")));
        liste.add(new Champion("Poppy", Lane.TOP, new BigDecimal("3.21")));
        liste.add(new Champion("Poppy", Lane.JGL, new BigDecimal("3.89")));
        liste.add(new Champion("Poppy", Lane.SUPP, new BigDecimal("0.72")));
        liste.add(new Champion("Talon", Lane.MID, new BigDecimal("8.13")));
        liste.add(new Champion("Yasuo", Lane.TOP, new BigDecimal("1.01")));
        liste.add(new Champion("Yasuo", Lane.MID, new BigDecimal("7.84")));
        liste.add(new Champion("Braum", Lane.SUPP, new BigDecimal("2.56")));
        liste.add(new Champion("Hecarim", Lane.JGL, new BigDecimal("14.7")));
        liste.add(new Champion("Lee Sin", Lane.JGL, new BigDecimal("23.11")));
        liste.add(new Champion("Quinn", Lane.TOP, new BigDecimal("1.33")));
        liste.add(new Champion("Taric", Lane.SUPP, new BigDecimal("0.74")));
        liste.add(new Champion("Yorick", Lane.TOP, new BigDecimal("6.52")));
        liste.add(new Champion("Yorick", Lane.MID, new BigDecimal("0.56")));
        liste.add(new Champion("Caitlyn", Lane.ADC, new BigDecimal("9.93")));
        liste.add(new Champion("Heimerdinger", Lane.TOP, new BigDecimal("1.06")));
        liste.add(new Champion("Leona", Lane.SUPP, new BigDecimal("12.47")));
        liste.add(new Champion("Rammus", Lane.JGL, new BigDecimal("1.82")));
        liste.add(new Champion("Teemo", Lane.TOP, new BigDecimal("1.9")));
        liste.add(new Champion("Zac", Lane.TOP, new BigDecimal("0.65")));
        liste.add(new Champion("Zac", Lane.JGL, new BigDecimal("1.9")));
        liste.add(new Champion("Zac", Lane.SUPP, new BigDecimal("0.53")));
        liste.add(new Champion("Camille", Lane.TOP, new BigDecimal("5.11")));
        liste.add(new Champion("Camille", Lane.MID, new BigDecimal("0.57")));
        liste.add(new Champion("Illaoi", Lane.TOP, new BigDecimal("0.89")));
        liste.add(new Champion("Lissandra", Lane.MID, new BigDecimal("1.84")));
        liste.add(new Champion("Rek’Sai", Lane.JGL, new BigDecimal("4.8")));
        liste.add(new Champion("Thresh", Lane.SUPP, new BigDecimal("25.25")));
        liste.add(new Champion("Zed", Lane.MID, new BigDecimal("10.89")));
        liste.add(new Champion("Cassiopeia", Lane.MID, new BigDecimal("1.53")));
        liste.add(new Champion("Irelia", Lane.TOP, new BigDecimal("8.24")));
        liste.add(new Champion("Irelia", Lane.MID, new BigDecimal("3.3")));
        liste.add(new Champion("Lucian", Lane.TOP, new BigDecimal("1.92")));
        liste.add(new Champion("Lucian", Lane.MID, new BigDecimal("4.93")));
        liste.add(new Champion("Lucian", Lane.ADC, new BigDecimal("4.85")));
        liste.add(new Champion("Renekton", Lane.TOP, new BigDecimal("9.53")));
        liste.add(new Champion("Renekton", Lane.MID, new BigDecimal("1.62")));
        liste.add(new Champion("Tristana", Lane.MID, new BigDecimal("1.56")));
        liste.add(new Champion("Tristana", Lane.ADC, new BigDecimal("11.1")));
        liste.add(new Champion("Ziggs", Lane.MID, new BigDecimal("0")));
        liste.add(new Champion("Cho’Gath", Lane.TOP, new BigDecimal("1.75")));
        liste.add(new Champion("Cho’Gath", Lane.MID, new BigDecimal("0.67")));
        liste.add(new Champion("Ivern", Lane.JGL, new BigDecimal("0.89")));
        liste.add(new Champion("Lulu", Lane.SUPP, new BigDecimal("12.45")));
        liste.add(new Champion("Rengar", Lane.TOP, new BigDecimal("1.89")));
        liste.add(new Champion("Rengar", Lane.JGL, new BigDecimal("1.16")));
        liste.add(new Champion("Trundle", Lane.JGL, new BigDecimal("0.58")));
        liste.add(new Champion("Zilean", Lane.MID, new BigDecimal("0.59")));
        liste.add(new Champion("Zilean", Lane.SUPP, new BigDecimal("3.63")));
        liste.add(new Champion("Corki", Lane.MID, new BigDecimal("1.38")));
        liste.add(new Champion("Janna", Lane.SUPP, new BigDecimal("2.46")));
        liste.add(new Champion("Lux", Lane.MID, new BigDecimal("0.86")));
        liste.add(new Champion("Lux", Lane.SUPP, new BigDecimal("3.4")));
        liste.add(new Champion("Riven", Lane.TOP, new BigDecimal("3.98")));
        liste.add(new Champion("Riven", Lane.MID, new BigDecimal("0.57")));
        liste.add(new Champion("Tryndamere", Lane.TOP, new BigDecimal("1.28")));
        liste.add(new Champion("Zyra", Lane.SUPP, new BigDecimal("1.65")));
        liste.add(new Champion("Darius", Lane.TOP, new BigDecimal("5.08")));
        liste.add(new Champion("Jarvan IV", Lane.JGL, new BigDecimal("2.54")));
        liste.add(new Champion("Malphite", Lane.TOP, new BigDecimal("6.89")));
        liste.add(new Champion("Malphite", Lane.MID, new BigDecimal("1.37")));
        liste.add(new Champion("Rumble", Lane.TOP, new BigDecimal("1.79")));
        liste.add(new Champion("Rumble", Lane.MID, new BigDecimal("1.88")));
        liste.add(new Champion("Twisted Fate", Lane.MID, new BigDecimal("10.10")));
        liste.add(new Champion("Diana", Lane.MID, new BigDecimal("2.08")));
        liste.add(new Champion("Jax", Lane.TOP, new BigDecimal("5.11")));
        liste.add(new Champion("Jax", Lane.JGL, new BigDecimal("0.59")));
        liste.add(new Champion("Malzahar", Lane.MID, new BigDecimal("1.4")));
        liste.add(new Champion("Ryze", Lane.TOP, new BigDecimal("2.6")));
        liste.add(new Champion("Ryze", Lane.MID, new BigDecimal("2.13")));
        liste.add(new Champion("Twitch", Lane.ADC, new BigDecimal("1.36")));
        liste.add(new Champion("Dr. Mundo", Lane.JGL, new BigDecimal("3.62")));
        liste.add(new Champion("Jayce", Lane.TOP, new BigDecimal("7.95")));
        liste.add(new Champion("Jayce", Lane.MID, new BigDecimal("1.31")));
        liste.add(new Champion("Maokai", Lane.TOP, new BigDecimal("3.17")));
        liste.add(new Champion("Maokai", Lane.SUPP, new BigDecimal("5.86")));
        liste.add(new Champion("Sejuani", Lane.TOP, new BigDecimal("0.58")));
        liste.add(new Champion("Sejuani", Lane.JGL, new BigDecimal("1.68")));
        liste.add(new Champion("Udyr", Lane.JGL, new BigDecimal("7.82")));
        liste.add(new Champion("Draven", Lane.ADC, new BigDecimal("1.68")));
        liste.add(new Champion("Jhin", Lane.ADC, new BigDecimal("5.72")));
        liste.add(new Champion("Master Yi", Lane.JGL, new BigDecimal("2.44")));
        liste.add(new Champion("Shaco", Lane.JGL, new BigDecimal("6.18")));
        liste.add(new Champion("Shaco", Lane.SUPP, new BigDecimal("3")));
        liste.add(new Champion("Urgot", Lane.TOP, new BigDecimal("1.64")));
        liste.add(new Champion("Xayah", Lane.ADC, new BigDecimal("3.87")));
        liste.add(new Champion("Rakan", Lane.SUPP, new BigDecimal("3.16")));
        liste.add(new Champion("Kayn", Lane.JGL, new BigDecimal("5.79")));
        liste.add(new Champion("Ornn", Lane.TOP, new BigDecimal("4.48")));
        liste.add(new Champion("Zoe", Lane.MID, new BigDecimal("5.27")));
        liste.add(new Champion("Kai'Sa", Lane.ADC, new BigDecimal("35.3")));
        liste.add(new Champion("Pyke", Lane.SUPP, new BigDecimal("6.75")));
        liste.add(new Champion("Neeko", Lane.MID, new BigDecimal("1.2")));
        liste.add(new Champion("Neeko", Lane.SUPP, new BigDecimal("0.8")));
        liste.add(new Champion("Sylas", Lane.TOP, new BigDecimal("10.58")));
        liste.add(new Champion("Sylas", Lane.MID, new BigDecimal("12.27")));
        liste.add(new Champion("Yuumi", Lane.SUPP, new BigDecimal("6.34")));
        liste.add(new Champion("Qiyana", Lane.MID, new BigDecimal("8.70")));
        liste.add(new Champion("Senna", Lane.ADC, new BigDecimal("1.85")));
        liste.add(new Champion("Senna", Lane.SUPP, new BigDecimal("14.17")));
        liste.add(new Champion("Aphelios", Lane.ADC, new BigDecimal("5.07")));
        liste.add(new Champion("Sett", Lane.TOP, new BigDecimal("4.7")));
        liste.add(new Champion("Sett", Lane.MID, new BigDecimal("1.53")));
        liste.add(new Champion("Sett", Lane.SUPP, new BigDecimal("3.65")));
        liste.add(new Champion("Lillia", Lane.JGL, new BigDecimal("5.8")));
        liste.add(new Champion("Yone", Lane.TOP, new BigDecimal("0.91")));
        liste.add(new Champion("Yone", Lane.MID, new BigDecimal("8.82")));
        liste.add(new Champion("Samira", Lane.ADC, new BigDecimal("21.67")));
        liste.add(new Champion("Seraphine", Lane.MID, new BigDecimal("0.68")));
        liste.add(new Champion("Seraphine", Lane.SUPP, new BigDecimal("5.13")));
        liste.add(new Champion("Rell", Lane.SUPP, new BigDecimal("4.71")));
        liste.add(new Champion("Viego", Lane.TOP, new BigDecimal("2.38")));
        liste.add(new Champion("Viego", Lane.MID, new BigDecimal("3.78")));
        liste.add(new Champion("Viego", Lane.JGL, new BigDecimal("7.21")));
        liste.add(new Champion("Xin Zhao", Lane.JGL, new BigDecimal("6.55")));
        return liste;
    }

    public static List<Champion> topChampions() {
        return champions()
                .stream()
                .filter(champion -> champion.getLane() == Lane.TOP)
                .sorted(Comparator.comparing(Champion::getWeight))
                .collect(Collectors.toList());
    }

    public static List<Champion> jglChampions() {
        return champions()
                .stream()
                .filter(champion -> champion.getLane() == Lane.JGL)
                .sorted(Comparator.comparing(Champion::getWeight))
                .collect(Collectors.toList());
    }

    public static List<Champion> midChampions() {
        return champions()
                .stream()
                .filter(champion -> champion.getLane() == Lane.MID)
                .sorted(Comparator.comparing(Champion::getWeight))
                .collect(Collectors.toList());
    }

    public static List<Champion> adcChampions() {
        return champions()
                .stream()
                .filter(champion -> champion.getLane() == Lane.ADC)
                .sorted(Comparator.comparing(Champion::getWeight))
                .collect(Collectors.toList());
    }

    public static List<Champion> suppChampions() {
        return champions()
                .stream()
                .filter(champion -> champion.getLane() == Lane.SUPP)
                .sorted(Comparator.comparing(Champion::getWeight))
                .collect(Collectors.toList());
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSummedWeight() {
        return summedWeight;
    }

    public void setSummedWeight(BigDecimal summedWeight) {
        this.summedWeight = summedWeight;
    }

    public Lane getLane() {
        return lane;
    }

    @Override
    public String toString() {
        return "Chamption: " + getName() + " Pick Rate:  " + getWeight() + " Summed: " + getSummedWeight();
    }
}
