package net.ukr.dreamsicle.showActiveButton;

import net.ukr.dreamsicle.read_write_copy_file.ShowActiveButtonIfFileExists;

import static net.ukr.dreamsicle.staticData.StaticData.*;

public class ShowActiveButtonGroup {

    public void getShowActiveButtonGroupCadets() {
        ShowActiveButtonIfFileExists showActiveButtonIfFileExists = new ShowActiveButtonIfFileExists();

        getActiveButtonFirstGroup(showActiveButtonIfFileExists);

        getActiveButtonSecondGroup(showActiveButtonIfFileExists);

        getActiveButtonThirdGroup(showActiveButtonIfFileExists);

        getActiveButtonFourthGroup(showActiveButtonIfFileExists);

        getActiveButtonFifthGroup(showActiveButtonIfFileExists);

        getActiveButtonSixthGroup(showActiveButtonIfFileExists);

    }

    private void getActiveButtonSixthGroup(ShowActiveButtonIfFileExists showActiveButtonIfFileExists) {
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstSixGroup, pathListCadets + "216.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstSixGroupOne, pathListCadets + "216.1.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstSixGroupTwo, pathListCadets + "216.2.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstSixGroupThird, pathListCadets + "216.3.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstSixGroupFour, pathListCadets + "216.4.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstSixGroupFive, pathListCadets + "216.5.txt");
    }

    private void getActiveButtonFifthGroup(ShowActiveButtonIfFileExists showActiveButtonIfFileExists) {
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFiveGroup, pathListCadets + "215.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFiveGroupOne, pathListCadets + "215.1.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFiveGroupTwo, pathListCadets + "215.2.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFiveGroupThird, pathListCadets + "215.3.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFiveGroupFour, pathListCadets + "215.4.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFiveGroupFive, pathListCadets + "215.5.txt");
    }

    private void getActiveButtonFourthGroup(ShowActiveButtonIfFileExists showActiveButtonIfFileExists) {
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFourGroup, pathListCadets + "214.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFourGroupOne, pathListCadets + "214.1.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFourGroupTwo, pathListCadets + "214.2.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFourGroupThird, pathListCadets + "214.3.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFourGroupFour, pathListCadets + "214.4.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFourGroupFive, pathListCadets + "214.5.txt");
    }

    private void getActiveButtonThirdGroup(ShowActiveButtonIfFileExists showActiveButtonIfFileExists) {
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstThreeGroup, pathListCadets + "213.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstThreeGroupOne, pathListCadets + "213.1.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstThreeGroupTwo, pathListCadets + "213.2.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstThreeGroupThird, pathListCadets + "213.3.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstThreeGroupFour, pathListCadets + "213.4.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstThreeGroupFive, pathListCadets + "213.5.txt");
    }

    private void getActiveButtonSecondGroup(ShowActiveButtonIfFileExists showActiveButtonIfFileExists) {
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstTwoGroup, pathListCadets + "212.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstTwoGroupOne, pathListCadets + "212.1.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstTwoGroupTwo, pathListCadets + "212.2.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstTwoGroupThird, pathListCadets + "212.3.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstTwoGroupFour, pathListCadets + "212.4.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstTwoGroupFive, pathListCadets + "212.5.txt");
    }

    private void getActiveButtonFirstGroup(ShowActiveButtonIfFileExists showActiveButtonIfFileExists) {
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroup, pathListCadets + "211.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroupOne, pathListCadets + "211.1.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroupTwo, pathListCadets + "211.2.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroupThird, pathListCadets + "211.3.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroupFour, pathListCadets + "211.4.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroupFive, pathListCadets + "211.5.txt");
    }
}
