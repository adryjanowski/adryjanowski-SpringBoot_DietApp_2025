package com.adryjanowski.SpringBoot_DietApp_2025.controller;

import java.util.List;

import com.adryjanowski.SpringBoot_DietApp_2025.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.adryjanowski.SpringBoot_DietApp_2025.model.Food;



@RestController
//@RequestMapping("/foods")
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;

    @GetMapping("/food")
    public List<Food> getAllFoods(){
        return foodService.getAllFoods();
    }

    @GetMapping("/food/{id}")
    public Food getSingleFood(@PathVariable long id){
        return getSingleFood(id);
    }
//    @Autowired
//    private IFoodService service;
//
//    @GetMapping
//    public String showHomePage() {
//        return "homePage";
//    }
//
//    @GetMapping("/register")
//    public String showRegistration() {
//        return "registerFoodPage";
//    }
//
//    @PostMapping("/save")
//    public String saveFood(
//            @ModelAttribute Food food,
//            Model model
//    ) {
//        service.saveFood(food);
//        Long id = service.saveFood(food).getId();
//        String message = "Record with id : '"+id+"' is saved successfully !";
//        model.addAttribute("message", message);
//        return "registerFoodPage";
//    }
//
//    @GetMapping("/getAllFood")
//    public String getAllFoods(
//            @RequestParam(value = "message", required = false) String message,
//            Model model
//    ) {
//        List<Food> foods= service.getAllFoods();
//        model.addAttribute("list", foods);
//        model.addAttribute("message", message);
//        return "allFoodPage";
//    }
//
//    @GetMapping("/edit")
//    public String getEditPage(
//            Model model,
//            RedirectAttributes attributes,
//            @RequestParam Long id
//    ) {
//        String page = null;
//        try {
//            Food food = service.getFoodById(id);
//            model.addAttribute("food", food);
//            page="editFoodPage";
//        } catch (FoodNotFoundException e) {
//            e.printStackTrace();
//            attributes.addAttribute("message", e.getMessage());
//            page="redirect:getAllFoods";
//        }
//        return page;
//    }
//
//    @PostMapping("/update")
//    public String updateInvoice(
//            @ModelAttribute Food food,
//            RedirectAttributes attributes
//    ) {
//        service.updateFood(food);
//        Long id = food.getId();
//        attributes.addAttribute("message", "Food with id: '"+id+"' is updated successfully !");
//        return "redirect:getAllFoods";
//    }
//
//    @GetMapping("/delete")
//    public String deleteInvoice(
//            @RequestParam Long id,
//            RedirectAttributes attributes
//    ) {
//        try {
//            service.deleteFoodById(id);
//            attributes.addAttribute("message", "Food with Id : '"+id+"' is removed successfully!");
//        } catch (FoodNotFoundException e) {
//            e.printStackTrace();
//            attributes.addAttribute("message", e.getMessage());
//        }
//        return "redirect:getAllFoods";
//    }
}
