package tool.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import tool.model.Champion;
import tool.model.Lane;
import tool.model.Side;

import java.math.BigDecimal;
import java.util.*;

public class ChampSelect {
    private final List<Champion> top = Champion.topChampions();
    private final List<Champion> jgl = Champion.jglChampions();
    private final List<Champion> mid = Champion.midChampions();
    private final List<Champion> adc = Champion.adcChampions();
    private final List<Champion> supp = Champion.suppChampions();
    private final List<Champion> champSelectChampions = new ArrayList<>();
    private final Side side;
    private final Lane lane;

    public ChampSelect(Side side, Lane lane) {
        this.side = side;
        this.lane = lane;
        generateChampSelect();
    }

    private void clearLists(Champion champion) {
        top.removeIf(champion1 -> champion1.getName().equals(champion.getName()));
        jgl.removeIf(champion1 -> champion1.getName().equals(champion.getName()));
        mid.removeIf(champion1 -> champion1.getName().equals(champion.getName()));
        adc.removeIf(champion1 -> champion1.getName().equals(champion.getName()));
        supp.removeIf(champion1 -> champion1.getName().equals(champion.getName()));
    }

    public GridPane generateView() {
        //Die Champ-Select Tabelle
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        //Labels für Teamüberschriften Blau/Rot
        Label blueTeam = new Label("Blue Side");
        blueTeam.setTextFill(Color.BLUE);
        blueTeam.setPadding(new Insets(20));
        Label redTeam = new Label("Red Side ");
        redTeam.setPadding(new Insets(20));
        redTeam.setTextFill(Color.RED);

        //Labels für die Picks
        Label bp1 = new Label();
        bp1.setPadding(new Insets(20));

        Label bp2 = new Label();
        bp2.setPadding(new Insets(20));

        Label bp3 = new Label();
        bp3.setPadding(new Insets(20));

        Label bp4 = new Label();
        bp4.setPadding(new Insets(20));

        Label bp5 = new Label();
        bp5.setPadding(new Insets(20));

        Label rp1 = new Label();
        rp1.setPadding(new Insets(20));

        Label rp2 = new Label();
        rp2.setPadding(new Insets(20));

        Label rp3 = new Label();
        rp3.setPadding(new Insets(20));

        Label rp4 = new Label();
        rp4.setPadding(new Insets(20));

        Label rp5 = new Label();
        rp5.setPadding(new Insets(20));

        gp.add(blueTeam, 0, 0);
        gp.add(redTeam, 2, 0);
        gp.add(bp1, 0, 1);
        gp.add(bp2, 0, 2);
        gp.add(bp3, 0, 3);
        gp.add(bp4, 0, 4);
        gp.add(bp5, 0, 5);
        gp.add(rp1, 2, 1);
        gp.add(rp2, 2, 2);
        gp.add(rp3, 2, 3);
        gp.add(rp4, 2, 4);
        gp.add(rp5, 2, 5);

        //Alles mittig setzen
        GridPane.setHalignment(blueTeam, HPos.CENTER);
        GridPane.setHalignment(redTeam, HPos.CENTER);
        GridPane.setHalignment(bp1, HPos.CENTER);
        GridPane.setHalignment(bp2, HPos.CENTER);
        GridPane.setHalignment(bp3, HPos.CENTER);
        GridPane.setHalignment(bp4, HPos.CENTER);
        GridPane.setHalignment(bp5, HPos.CENTER);
        GridPane.setHalignment(rp1, HPos.CENTER);
        GridPane.setHalignment(rp2, HPos.CENTER);
        GridPane.setHalignment(rp3, HPos.CENTER);
        GridPane.setHalignment(rp4, HPos.CENTER);
        GridPane.setHalignment(rp5, HPos.CENTER);

        fillLabels(bp1, bp2, bp3, bp4, bp5, rp1, rp2, rp3, rp4, rp5);
        return gp;
    }

    private void generateChampSelect() {
        //Liste mit allen blauen Lanes und zufällig sortiert, um die zufällige Pick-Order zu simulieren
        List<Lane> bluePicks = new LinkedList<>();
        bluePicks.add(Lane.TOP);
        bluePicks.add(Lane.JGL);
        bluePicks.add(Lane.MID);
        bluePicks.add(Lane.ADC);
        bluePicks.add(Lane.SUPP);
        Collections.shuffle(bluePicks);

        //Liste mit allen roten Lanes und zufällig sortiert, um die zufällige Pick-Order zu simulieren
        List<Lane> redPicks = new LinkedList<>();
        redPicks.add(Lane.TOP);
        redPicks.add(Lane.JGL);
        redPicks.add(Lane.MID);
        redPicks.add(Lane.ADC);
        redPicks.add(Lane.SUPP);
        Collections.shuffle(redPicks);

        //Die Champions in die Champ-Select einfügen und aus den Champion-Listen entfernen,
        //um doppelte Picks zu vermeiden

        //BP1
        Champion BP1 = searchChampion(bluePicks.get(0));
        clearLists(BP1);

        //RP1
        Champion RP1 = searchChampion(redPicks.get(0));
        clearLists(RP1);

        //RP2
        Champion RP2 = searchChampion(redPicks.get(1));
        clearLists(RP2);

        //BP2
        Champion BP2 = searchChampion(bluePicks.get(1));
        clearLists(BP2);

        //BP3
        Champion BP3 = searchChampion(bluePicks.get(2));
        clearLists(BP3);

        //RP3
        Champion RP3 = searchChampion(redPicks.get(2));
        clearLists(RP3);

        //RP4
        Champion RP4 = searchChampion(redPicks.get(3));
        clearLists(RP4);

        //BP4
        Champion BP4 = searchChampion(bluePicks.get(3));
        clearLists(BP4);

        //BP5
        Champion BP5 = searchChampion(bluePicks.get(4));
        clearLists(BP5);

        //RP5
        Champion RP5 = searchChampion(redPicks.get(4));
        clearLists(RP5);

        //Die gefundenen Champions zur Liste hinzufügen
        champSelectChampions.add(BP1);
        champSelectChampions.add(BP2);
        champSelectChampions.add(BP3);
        champSelectChampions.add(BP4);
        champSelectChampions.add(BP5);
        champSelectChampions.add(RP1);
        champSelectChampions.add(RP2);
        champSelectChampions.add(RP3);
        champSelectChampions.add(RP4);
        champSelectChampions.add(RP5);
        /*champSelectAusgabe();
        System.out.println();*/
    }


    private void fillLabels(Label bp1, Label bp2, Label bp3, Label bp4, Label bp5, Label rp1, Label rp2, Label rp3, Label rp4, Label rp5) {
        int index = -1;
        switch (lane) {
            case TOP:
                if (side == Side.BLUE) {
                    index = champSelectChampions
                            .indexOf(champSelectChampions
                                    .stream()
                                    .filter(champion -> champion.getLane() == Lane.TOP)
                                    .findFirst()
                                    .get());
                }
                if (side == Side.RED) {
                    index = champSelectChampions
                            .indexOf(champSelectChampions
                                    .stream()
                                    .filter(champion -> champion.getLane() == Lane.TOP)
                                    .skip(1)
                                    .findFirst()
                                    .get());
                }
                break;
            case JGL:
                if (side == Side.BLUE) {
                    index = champSelectChampions
                            .indexOf(champSelectChampions
                                    .stream()
                                    .filter(champion -> champion.getLane() == Lane.JGL)
                                    .findFirst()
                                    .get());
                }
                if (side == Side.RED) {
                    index = champSelectChampions
                            .indexOf(champSelectChampions
                                    .stream()
                                    .filter(champion -> champion.getLane() == Lane.JGL)
                                    .skip(1)
                                    .findFirst()
                                    .get());
                }
                break;
            case MID:
                if (side == Side.BLUE) {
                    index = champSelectChampions
                            .indexOf(champSelectChampions
                                    .stream()
                                    .filter(champion -> champion.getLane() == Lane.MID)
                                    .findFirst()
                                    .get());
                }
                if (side == Side.RED) {
                    index = champSelectChampions
                            .indexOf(champSelectChampions
                                    .stream()
                                    .filter(champion -> champion.getLane() == Lane.MID)
                                    .skip(1)
                                    .findFirst()
                                    .get());
                }
                break;
            case ADC:
                if (side == Side.BLUE) {
                    index = champSelectChampions
                            .indexOf(champSelectChampions
                                    .stream()
                                    .filter(champion -> champion.getLane() == Lane.ADC)
                                    .findFirst()
                                    .get());
                }
                if (side == Side.RED) {
                    index = champSelectChampions
                            .indexOf(champSelectChampions
                                    .stream()
                                    .filter(champion -> champion.getLane() == Lane.ADC)
                                    .skip(1)
                                    .findFirst()
                                    .get());
                }
                break;
            case SUPP:
                if (side == Side.BLUE) {
                    index = champSelectChampions
                            .indexOf(champSelectChampions
                                    .stream()
                                    .filter(champion -> champion.getLane() == Lane.SUPP)
                                    .findFirst()
                                    .get());
                }
                if (side == Side.RED) {
                    index = champSelectChampions
                            .indexOf(champSelectChampions
                                    .stream()
                                    .filter(champion -> champion.getLane() == Lane.SUPP)
                                    .skip(1)
                                    .findFirst()
                                    .get());
                }
                break;
            case NONE:
                index = 10;
                break;
        }
        switch (index) {
            case 0:
                bp1.setText("Your Pick");
                bp1.setTextFill(Color.GREEN);
                rp1.setText("?");
                bp2.setText("?");
                rp2.setText("?");
                bp3.setText("?");
                rp3.setText("?");
                bp4.setText("?");
                rp4.setText("?");
                bp5.setText("?");
                rp5.setText("?");
                break;
            case 1:
                bp1.setText(champSelectChampions.get(0).getLane() + " " + champSelectChampions.get(0).getName());
                rp1.setText(champSelectChampions.get(5).getName() + " " + champSelectChampions.get(5).getLane());
                bp2.setText("Your Pick");
                bp2.setTextFill(Color.GREEN);
                rp2.setText(champSelectChampions.get(6).getName() + " " + champSelectChampions.get(6).getLane());
                bp3.setText("?");
                rp3.setText("?");
                bp4.setText("?");
                rp4.setText("?");
                bp5.setText("?");
                rp5.setText("?");
                break;
            case 2:
                bp1.setText(champSelectChampions.get(0).getLane() + " " + champSelectChampions.get(0).getName());
                rp1.setText(champSelectChampions.get(5).getName() + " " + champSelectChampions.get(5).getLane());
                bp2.setText("?");
                rp2.setText(champSelectChampions.get(6).getName() + " " + champSelectChampions.get(6).getLane());
                bp3.setText("Your Pick");
                bp3.setTextFill(Color.GREEN);
                rp3.setText("?");
                bp4.setText("?");
                rp4.setText("?");
                bp5.setText("?");
                rp5.setText("?");
                break;
            case 3:
                bp1.setText(champSelectChampions.get(0).getLane() + " " + champSelectChampions.get(0).getName());
                rp1.setText(champSelectChampions.get(5).getName() + " " + champSelectChampions.get(5).getLane());
                bp2.setText(champSelectChampions.get(1).getLane() + " " + champSelectChampions.get(1).getName());
                rp2.setText(champSelectChampions.get(6).getName() + " " + champSelectChampions.get(6).getLane());
                bp3.setText(champSelectChampions.get(2).getLane() + " " + champSelectChampions.get(2).getName());
                rp3.setText(champSelectChampions.get(7).getName() + " " + champSelectChampions.get(7).getLane());
                bp4.setText("Your Pick");
                bp4.setTextFill(Color.GREEN);
                rp4.setText(champSelectChampions.get(8).getName() + " " + champSelectChampions.get(8).getLane());
                bp5.setText("?");
                rp5.setText("?");
                break;
            case 4:
                bp1.setText(champSelectChampions.get(0).getLane() + " " + champSelectChampions.get(0).getName());
                rp1.setText(champSelectChampions.get(5).getName() + " " + champSelectChampions.get(5).getLane());
                bp2.setText(champSelectChampions.get(1).getLane() + " " + champSelectChampions.get(1).getName());
                rp2.setText(champSelectChampions.get(6).getName() + " " + champSelectChampions.get(6).getLane());
                bp3.setText(champSelectChampions.get(2).getLane() + " " + champSelectChampions.get(2).getName());
                rp3.setText(champSelectChampions.get(7).getName() + " " + champSelectChampions.get(7).getLane());
                bp4.setText("?");
                rp4.setText(champSelectChampions.get(8).getName() + " " + champSelectChampions.get(8).getLane());
                bp5.setText("Your Pick");
                bp5.setTextFill(Color.GREEN);
                rp5.setText("?");
                break;
            case 5:
                bp1.setText(champSelectChampions.get(0).getLane() + " " + champSelectChampions.get(0).getName());
                rp1.setText("Your Pick");
                rp1.setTextFill(Color.GREEN);
                bp2.setText("?");
                rp2.setText("?");
                bp3.setText("?");
                rp3.setText("?");
                bp4.setText("?");
                rp4.setText("?");
                bp5.setText("?");
                rp5.setText("?");
                break;
            case 6:
                bp1.setText(champSelectChampions.get(0).getLane() + " " + champSelectChampions.get(0).getName());
                rp1.setText("?");
                bp2.setText("?");
                rp2.setText("Your Pick");
                rp2.setTextFill(Color.GREEN);
                bp3.setText("?");
                rp3.setText("?");
                bp4.setText("?");
                rp4.setText("?");
                bp5.setText("?");
                rp5.setText("?");
                break;
            case 7:
                bp1.setText(champSelectChampions.get(0).getLane() + " " + champSelectChampions.get(0).getName());
                rp1.setText(champSelectChampions.get(5).getName() + " " + champSelectChampions.get(5).getLane());
                bp2.setText(champSelectChampions.get(1).getLane() + " " + champSelectChampions.get(1).getName());
                rp2.setText(champSelectChampions.get(6).getName() + " " + champSelectChampions.get(6).getLane());
                bp3.setText(champSelectChampions.get(2).getLane() + " " + champSelectChampions.get(2).getName());
                rp3.setText("Your Pick");
                rp3.setTextFill(Color.GREEN);
                bp4.setText("?");
                rp4.setText("?");
                bp5.setText("?");
                rp5.setText("?");
                break;
            case 8:
                bp1.setText(champSelectChampions.get(0).getLane() + " " + champSelectChampions.get(0).getName());
                rp1.setText(champSelectChampions.get(5).getName() + " " + champSelectChampions.get(5).getLane());
                bp2.setText(champSelectChampions.get(1).getLane() + " " + champSelectChampions.get(1).getName());
                rp2.setText(champSelectChampions.get(6).getName() + " " + champSelectChampions.get(6).getLane());
                bp3.setText(champSelectChampions.get(2).getLane() + " " + champSelectChampions.get(2).getName());
                rp3.setText("?");
                bp4.setText("?");
                rp4.setText("Your Pick");
                rp4.setTextFill(Color.GREEN);
                bp5.setText("?");
                rp5.setText("?");
                break;
            case 9:
                bp1.setText(champSelectChampions.get(0).getLane() + " " + champSelectChampions.get(0).getName());
                rp1.setText(champSelectChampions.get(5).getName() + " " + champSelectChampions.get(5).getLane());
                bp2.setText(champSelectChampions.get(1).getLane() + " " + champSelectChampions.get(1).getName());
                rp2.setText(champSelectChampions.get(6).getName() + " " + champSelectChampions.get(6).getLane());
                bp3.setText(champSelectChampions.get(2).getLane() + " " + champSelectChampions.get(2).getName());
                rp3.setText(champSelectChampions.get(7).getName() + " " + champSelectChampions.get(7).getLane());
                bp4.setText(champSelectChampions.get(3).getLane() + " " + champSelectChampions.get(3).getName());
                rp4.setText(champSelectChampions.get(8).getName() + " " + champSelectChampions.get(8).getLane());
                bp5.setText(champSelectChampions.get(4).getLane() + " " + champSelectChampions.get(4).getName());
                rp5.setText("Your Pick");
                rp5.setTextFill(Color.GREEN);
                break;
            case 10:
                bp1.setText(champSelectChampions.get(0).getLane() + " " + champSelectChampions.get(0).getName());
                rp1.setText(champSelectChampions.get(5).getName() + " " + champSelectChampions.get(5).getLane());
                bp2.setText(champSelectChampions.get(1).getLane() + " " + champSelectChampions.get(1).getName());
                rp2.setText(champSelectChampions.get(6).getName() + " " + champSelectChampions.get(6).getLane());
                bp3.setText(champSelectChampions.get(2).getLane() + " " + champSelectChampions.get(2).getName());
                rp3.setText(champSelectChampions.get(7).getName() + " " + champSelectChampions.get(7).getLane());
                bp4.setText(champSelectChampions.get(3).getLane() + " " + champSelectChampions.get(3).getName());
                rp4.setText(champSelectChampions.get(8).getName() + " " + champSelectChampions.get(8).getLane());
                bp5.setText(champSelectChampions.get(4).getLane() + " " + champSelectChampions.get(4).getName());
                rp5.setText(champSelectChampions.get(9).getName() + " " + champSelectChampions.get(9).getLane());
                break;
        }
    }

    private Champion searchChampion(Lane lane) {
        List<Champion> liste = new LinkedList<>();
        switch (lane) {
            case TOP:
                liste = top;
                break;
            case JGL:
                liste = jgl;
                break;
            case MID:
                liste = mid;
                break;
            case ADC:
                liste = adc;
                break;
            case SUPP:
                liste = supp;
                break;
        }
        //Return
        Champion champion = new Champion();

        //Zufallzahlengenerator, 0.0 - 1.0
        Random r = new Random();

        //Die Pick-Rates zusammenzählen
        double summePickRates = liste.stream()
                .map(Champion::getWeight)
                .reduce(BigDecimal::add)
                .get()
                .doubleValue();

        //Zufallszahl abhängig der Pick-Rates generieren
        double random = summePickRates * r.nextDouble();

        //Pick generieren
        if (random <= liste.get(0).getSummedWeight().doubleValue()) champion = liste.get(0);
        else
            for (int i = 1; i < liste.size(); i++) {
                liste.get(i).setSummedWeight((liste.get(i - 1).getSummedWeight().add(liste.get(i).getWeight())));
                if (liste.get(i - 1).getSummedWeight().doubleValue() < random && random <= liste.get(i).getSummedWeight().doubleValue()) {
                    champion = liste.get(i);
                    break;
                }
            }
        return champion;
    }

    /*
    public void champSelectAusgabe() {
        String ausgabe =
                champSelectChampions.get(0).getLane() + " " + champSelectChampions.get(0).getName()
                        + " - "
                        + champSelectChampions.get(5).getName() + " " + champSelectChampions.get(5).getLane()
                        + "\n"
                        + champSelectChampions.get(1).getLane() + " " + champSelectChampions.get(1).getName()
                        + " - "
                        + champSelectChampions.get(6).getName() + " " + champSelectChampions.get(6).getLane()
                        + "\n"
                        + champSelectChampions.get(2).getLane() + " " + champSelectChampions.get(2).getName()
                        + " - "
                        + champSelectChampions.get(7).getName() + " " + champSelectChampions.get(7).getLane()
                        + "\n"
                        + champSelectChampions.get(3).getLane() + " " + champSelectChampions.get(3).getName()
                        + " - "
                        + champSelectChampions.get(8).getName() + " " + champSelectChampions.get(8).getLane()
                        + "\n"
                        + champSelectChampions.get(4).getLane() + " " + champSelectChampions.get(4).getName()
                        + " - "
                        + champSelectChampions.get(9).getName() + " " + champSelectChampions.get(9).getLane();
        System.out.println(ausgabe);
    }
    */
}
