package net.ukr.dreamsicle.showActiveButton;

import net.ukr.dreamsicle.read_write_copy_file.ExistsFile;

import static net.ukr.dreamsicle.staticData.StaticData.*;

public class ShowActiveButtonGroup {

    public void getShowActiveButtonGroupCadets() {
        ExistsFile existsFile = new ExistsFile();

        getActiveButtonFirstGroup(existsFile);

        getActiveButtonSecondGroup(existsFile);

        getActiveButtonThirdGroup(existsFile);

        getActiveButtonFourthGroup(existsFile);

        getActiveButtonFifthGroup(existsFile);

        getActiveButtonSixthGroup(existsFile);

    }

    private void getActiveButtonSixthGroup(ExistsFile existsFile) {
        existsFile.getExistsFile(firstSixGroup, path + "216.txt");
        existsFile.getExistsFile(firstSixGroupOne, path + "216.1.txt");
        existsFile.getExistsFile(firstSixGroupTwo, path + "216.2.txt");
        existsFile.getExistsFile(firstSixGroupThird, path + "216.3.txt");
        existsFile.getExistsFile(firstSixGroupFour, path + "216.4.txt");
        existsFile.getExistsFile(firstSixGroupFive, path + "216.5.txt");
    }

    private void getActiveButtonFifthGroup(ExistsFile existsFile) {
        existsFile.getExistsFile(firstFiveGroup, path + "215.txt");
        existsFile.getExistsFile(firstFiveGroupOne, path + "215.1.txt");
        existsFile.getExistsFile(firstFiveGroupTwo, path + "215.2.txt");
        existsFile.getExistsFile(firstFiveGroupThird, path + "215.3.txt");
        existsFile.getExistsFile(firstFiveGroupFour, path + "215.4.txt");
        existsFile.getExistsFile(firstFiveGroupFive, path + "215.5.txt");
    }

    private void getActiveButtonFourthGroup(ExistsFile existsFile) {
        existsFile.getExistsFile(firstFourGroup, path + "214.txt");
        existsFile.getExistsFile(firstFourGroupOne, path + "214.1.txt");
        existsFile.getExistsFile(firstFourGroupTwo, path + "214.2.txt");
        existsFile.getExistsFile(firstFourGroupThird, path + "214.3.txt");
        existsFile.getExistsFile(firstFourGroupFour, path + "214.4.txt");
        existsFile.getExistsFile(firstFourGroupFive, path + "214.5.txt");
    }

    private void getActiveButtonThirdGroup(ExistsFile existsFile) {
        existsFile.getExistsFile(firstThreeGroup, path + "213.txt");
        existsFile.getExistsFile(firstThreeGroupOne, path + "213.1.txt");
        existsFile.getExistsFile(firstThreeGroupTwo, path + "213.2.txt");
        existsFile.getExistsFile(firstThreeGroupThird, path + "213.3.txt");
        existsFile.getExistsFile(firstThreeGroupFour, path + "213.4.txt");
        existsFile.getExistsFile(firstThreeGroupFive, path + "213.5.txt");
    }

    private void getActiveButtonSecondGroup(ExistsFile existsFile) {
        existsFile.getExistsFile(firstTwoGroup, path + "212.txt");
        existsFile.getExistsFile(firstTwoGroupOne, path + "212.1.txt");
        existsFile.getExistsFile(firstTwoGroupTwo, path + "212.2.txt");
        existsFile.getExistsFile(firstTwoGroupThird, path + "212.3.txt");
        existsFile.getExistsFile(firstTwoGroupFour, path + "212.4.txt");
        existsFile.getExistsFile(firstTwoGroupFive, path + "212.5.txt");
    }

    private void getActiveButtonFirstGroup(ExistsFile existsFile) {
        existsFile.getExistsFile(firstOneGroup, path + "211.txt");
        existsFile.getExistsFile(firstOneGroupOne, path + "211.1.txt");
        existsFile.getExistsFile(firstOneGroupTwo, path + "211.2.txt");
        existsFile.getExistsFile(firstOneGroupThird, path + "211.3.txt");
        existsFile.getExistsFile(firstOneGroupFour, path + "211.4.txt");
        existsFile.getExistsFile(firstOneGroupFive, path + "211.5.txt");
    }
}
