package by.it.academy.enterprise.web;

import by.it.academy.enterprise.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class DogController {
    @Autowired
    private DogService dogServiceController;

    @RequestMapping(
            value = "/dog/add",
            params = {"name", "age", "breed"},
            method = GET)
    @ResponseBody
    private int addDog(@RequestParam Map<String, String> param) {
        return dogServiceController.addDog( param.get("name"), Short.valueOf(param.get("age")),
                param.get("breed"));
    }

    @RequestMapping(
            value = "/dog/update",
            params = {"id", "name", "age", "breed"},
            method = GET)
    @ResponseBody
    private int updateDog(@RequestParam Map<String, String> param) {
        try {
            return dogServiceController.updateDog(Long.valueOf(param.get("id")), param.get("name"), Short.valueOf(param.get("age")),
                    param.get("breed"));
        } catch (IllegalArgumentException ignore) {
            return 0;
        }
    }

    @RequestMapping(value = "/dog/delete", params = "id", method = GET)
    @ResponseBody
    private int deleteDog(@RequestParam("id") Long id) {
        return dogServiceController.deleteDog(id);
    }

    @RequestMapping(value = "/dog/getName", params = "id", method = GET)
    @ResponseBody
    private String getDog(@RequestParam("id") Long id) {
        return dogServiceController.getDogNameByID(id);
    }
}
