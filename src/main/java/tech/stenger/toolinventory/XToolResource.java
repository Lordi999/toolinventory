package tech.stenger.toolinventory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.stenger.toolinventory.enumeration.Type;
import tech.stenger.toolinventory.model.XTool;
import tech.stenger.toolinventory.service.XToolService;

import java.util.List;

@RestController
@RequestMapping("/tool")
public class XToolResource {
    private final XToolService toolService;


    public XToolResource(XToolService toolService) {
        this.toolService = toolService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<XTool>> getAllTools(){
        List<XTool> tools = toolService.findAllXTools();
        return new ResponseEntity<>(tools, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<XTool> getToolById(@PathVariable("id") long id){
        XTool tool = toolService.findXToolById(id);
        return new ResponseEntity<>(tool, HttpStatus.OK);
    }

    @GetMapping("/find/type/{type}")
    public ResponseEntity<List<XTool>> getToolByType(@PathVariable("type") Type type){
        List<XTool> tools = toolService.findXToolByType(type);
        return new ResponseEntity<>(tools, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<XTool> addTool(@RequestBody XTool tool){
        XTool newTool = toolService.addXTool(tool);
        return new ResponseEntity<>(newTool, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<XTool> updateTool(@RequestBody XTool tool){
        XTool updatedTool = toolService.updateXTool(tool);
        return new ResponseEntity<>(updatedTool, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTool(@PathVariable("id") long id){
        toolService.deleteXTool(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
