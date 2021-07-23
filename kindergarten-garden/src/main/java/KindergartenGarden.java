import java.util.*;

class KindergartenGarden {

    private String garden;

    KindergartenGarden(String garden) {
        this.garden = garden;
    }

    List<Plant> getPlantsOfStudent(String student) {
        List<Plant> result = new ArrayList<>();
        String[] rows = garden.split("\\n");
        int index = student.charAt(0) - 'A';

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                result.add(Plant.getPlant(rows[i].charAt(2 * index + j)));

        return result;
    }

}
