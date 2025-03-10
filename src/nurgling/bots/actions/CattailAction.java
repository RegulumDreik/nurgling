package nurgling.bots.actions;

import haven.Coord;
import haven.GItem;
import haven.Gob;
import haven.WItem;

import nurgling.NAlias;
import nurgling.NGameUI;
import nurgling.NUtils;
import nurgling.tools.Finder;

import java.util.ArrayList;
import java.util.Arrays;

import static haven.OCache.posres;

public class CattailAction implements Action {
    @Override
    public Results run ( NGameUI gui )
            throws InterruptedException {
        while (gui.getInventory().getFreeSpace() > 0) {
            Thread.sleep(50);
            for (GItem fordrop : gui.getInventory().getItems(
                    new NAlias(new ArrayList<String>(Arrays.asList("cattail")),
                            new ArrayList<>(Arrays.asList("fibre"))))) {
                NUtils.drop(fordrop);
            }
        }
//            for (WItem fordrop : gui.getInventory().getItems(
//                    new NAlias(new ArrayList<String>(Arrays.asList("cattail")),
//                            new ArrayList<>(Arrays.asList("fibre"))))) {
//                NUtils.drop(fordrop);
//            }
//            if(gui.getInventory("Basket")!=null) {
//                for (WItem fordrop : gui.getInventory("Basket").getItems(
//                        new NAlias(new ArrayList<String>(Arrays.asList("cattail")),
//                                new ArrayList<>(Arrays.asList("fibre"))))) {
//                    NUtils.drop(fordrop);
//                }
//            }
//        }
//        return new Results(Results.Types.SUCCESS);
        return new Results(Results.Types.SUCCESS);
    }

//    @Override
//    public Results run(NGameUI gui)
//            throws InterruptedException {
//        while (gui.getInventory().getFreeSpace() > 0) {
//            Thread.sleep(50);
//            for (WItem fordrop : gui.getInventory().getItems(
//                    new NAlias(new ArrayList<String>(Arrays.asList("cattail")),
//                            new ArrayList<>(Arrays.asList("fibre"))))) {
//                NUtils.drop(fordrop);
//            }
//            if(gui.getInventory("Basket")!=null) {
//                for (WItem fordrop : gui.getInventory("Basket").getItems(
//                        new NAlias(new ArrayList<String>(Arrays.asList("cattail")),
//                                new ArrayList<>(Arrays.asList("fibre"))))) {
//                    NUtils.drop(fordrop);
//                }
//            }
//        }
//        return new Results(Results.Types.SUCCESS);
//    }

    public CattailAction(
    ) {

    }

}
