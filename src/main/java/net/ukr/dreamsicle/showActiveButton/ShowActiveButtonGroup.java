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
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstSixGroup, PATH_LIST_CADETS + "216.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstSixGroupOne, PATH_LIST_CADETS + "216.1.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstSixGroupTwo, PATH_LIST_CADETS + "216.2.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstSixGroupThird, PATH_LIST_CADETS + "216.3.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstSixGroupFour, PATH_LIST_CADETS + "216.4.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstSixGroupFive, PATH_LIST_CADETS + "216.5.txt");
    }

    private void getActiveButtonFifthGroup(ShowActiveButtonIfFileExists showActiveButtonIfFileExists) {
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFiveGroup, PATH_LIST_CADETS + "215.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFiveGroupOne, PATH_LIST_CADETS + "215.1.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFiveGroupTwo, PATH_LIST_CADETS + "215.2.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFiveGroupThird, PATH_LIST_CADETS + "215.3.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFiveGroupFour, PATH_LIST_CADETS + "215.4.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFiveGroupFive, PATH_LIST_CADETS + "215.5.txt");
    }

    private void getActiveButtonFourthGroup(ShowActiveButtonIfFileExists showActiveButtonIfFileExists) {
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFourGroup, PATH_LIST_CADETS + "214.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFourGroupOne, PATH_LIST_CADETS + "214.1.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFourGroupTwo, PATH_LIST_CADETS + "214.2.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFourGroupThird, PATH_LIST_CADETS + "214.3.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFourGroupFour, PATH_LIST_CADETS + "214.4.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstFourGroupFive, PATH_LIST_CADETS + "214.5.txt");
    }

    private void getActiveButtonThirdGroup(ShowActiveButtonIfFileExists showActiveButtonIfFileExists) {
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstThreeGroup, PATH_LIST_CADETS + "213.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstThreeGroupOne, PATH_LIST_CADETS + "213.1.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstThreeGroupTwo, PATH_LIST_CADETS + "213.2.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstThreeGroupThird, PATH_LIST_CADETS + "213.3.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstThreeGroupFour, PATH_LIST_CADETS + "213.4.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstThreeGroupFive, PATH_LIST_CADETS + "213.5.txt");
    }

    private void getActiveButtonSecondGroup(ShowActiveButtonIfFileExists showActiveButtonIfFileExists) {
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstTwoGroup, PATH_LIST_CADETS + "212.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstTwoGroupOne, PATH_LIST_CADETS + "212.1.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstTwoGroupTwo, PATH_LIST_CADETS + "212.2.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstTwoGroupThird, PATH_LIST_CADETS + "212.3.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstTwoGroupFour, PATH_LIST_CADETS + "212.4.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstTwoGroupFive, PATH_LIST_CADETS + "212.5.txt");
    }

    private void getActiveButtonFirstGroup(ShowActiveButtonIfFileExists showActiveButtonIfFileExists) {
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroup, PATH_LIST_CADETS + "211.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroupOne, PATH_LIST_CADETS + "211.1.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroupTwo, PATH_LIST_CADETS + "211.2.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroupThird, PATH_LIST_CADETS + "211.3.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroupFour, PATH_LIST_CADETS + "211.4.txt");
        showActiveButtonIfFileExists.getShowActiveButtonIfFileExists(firstOneGroupFive, PATH_LIST_CADETS + "211.5.txt");
    }
}
