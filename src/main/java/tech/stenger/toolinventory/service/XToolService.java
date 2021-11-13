package tech.stenger.toolinventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.stenger.toolinventory.enumeration.Type;
import tech.stenger.toolinventory.exception.UserNotFoundException;
import tech.stenger.toolinventory.model.XTool;
import tech.stenger.toolinventory.repo.XToolRepo;

import java.util.List;

@Service
public class XToolService {
    private final XToolRepo ToolRepo;

    @Autowired
    public XToolService(XToolRepo pToolRepo) {
        ToolRepo = pToolRepo;
    }

    public XTool addXTool(XTool pTool){
        return ToolRepo.save(pTool);
    }

    public List<XTool> findAllXTools(){
        return ToolRepo.findAll();
    }

    public XTool updateXTool(XTool pTool){
        return ToolRepo.save(pTool);
    }

    public XTool findXToolById(long pId){
        return ToolRepo.findXToolById(pId)
                .orElseThrow(() -> new UserNotFoundException("Tool by id " + pId + " could not be found"));
    }

    public void deleteXTool(long pId){
        ToolRepo.deleteXToolById(pId);
    }

    public List<XTool> findXToolByType(Type type) {
        return ToolRepo.findXToolByType(type)
                .orElseThrow(() -> new UserNotFoundException("Tool by type " + type + " could not be found"));
    }
}
