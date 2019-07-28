// Task 20
//This will return the list of application an Identity has (one or more)
<?xml version='1.0' encoding='UTF-8'?>
<!DOCTYPE Rule PUBLIC "sailpoint.dtd" "sailpoint.dtd">
<Rule created="1564250500488" id="402881096c3491b2016c34986d880016" language="beanshell" modified="1564350110128" name="Task 20">
  <Description>This rule is only for testing.</Description>
  <Source>
 		import sailpoint.object.Identity;
  	import sailpoint.object.Application;
  	import java.util.ArrayList;
  	import java.util.List;
  	import sailpoint.object.Link;
  	import org.apache.log4j.Logger;
  	
  	Identity iden = context.getObjectByName(Identity.class,"abhisek.paudel");
    //one random identity (abhisek.paudel) is put in iden object

  	List links= iden.getLinks();
  	Logger log = Logger.getLogger("dexperts.us");
  	List list =new ArrayList();
 

   for(Link link:links){
   //application consist inside the link. so it is iterated in for each loop
    String name = link.getApplicationName();
    //getAppName method is called from link method
    log.info(name);
     list.add(name);
     //the strings are added in the dynamic list
   }
  
  
  return list;
    
  </Source>
</Rule>
