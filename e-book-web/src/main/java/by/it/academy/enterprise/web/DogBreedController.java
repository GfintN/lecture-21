package by.it.academy.enterprise.web;

import by.it.academy.enterprise.service.DogBreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class DogBreedController {
    @Autowired
    private DogBreedService dogBreedServiceController;

    @RequestMapping(value = "/dog-breed/add", params = "breed", method = GET)
    @ResponseBody
    private int addDog(@RequestParam("breed") String breed) {
        return dogBreedServiceController.addDog(breed);
    }

    @RequestMapping(
            value = "/dog-breed/update",
            params = {"breed", "id"},
            method = GET)
    @ResponseBody
    private int updateDog(@RequestParam Map<String, String> param) {
        try {
            return dogBreedServiceController.updateDog(Long.valueOf(param.get("id")), param.get("breed"));
        } catch (IllegalArgumentException ignore) {
            return 0;
        }
    }

    @RequestMapping(value = "/dog-breed/delete", params = "id", method = GET)
    @ResponseBody
    private int deleteDog(@RequestParam("id") Long id) {
        return dogBreedServiceController.deleteDog(id);
    }

    @RequestMapping(value = "/dog-breed/getName", params = "id", method = GET)
    @ResponseBody
    private String getDog(@RequestParam("id") Long id) {
        return dogBreedServiceController.getDogNameByID(id);
    }
}
