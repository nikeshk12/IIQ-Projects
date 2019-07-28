//Task 24
// This will return all managers of every identity
<?xml version='1.0' encoding='UTF-8'?>
<!DOCTYPE Rule PUBLIC "sailpoint.dtd" "sailpoint.dtd">
<Rule created="1564348184241" id="402881096c3987ce016c3a6af6b10021" language="beanshell" modified="1564349558861" name="Task 24">
  <Description>This rule is only for testing.</Description>
  <Source>
 		import sailpoint.object.Identity;
  	import sailpoint.object.Link;
  	import java.util.List;
  	import java.util.ArrayList;
  
  	List idens = context.getObjects(Identity.class);
    //All identities are put in a list named idens
  	List li = new ArrayList();
  	
  for(Identity iden:idens){
      //every identity are iterated in for each loop
        Identity managers = iden.getManager();
      //getManager method is called in iden class
    if (managers!=null){
      	li.add(managers.getName());
        //if there are managers in a identity, it will be added in the list
    }
  }
  
    return li;
  </Source>
</Rule>
