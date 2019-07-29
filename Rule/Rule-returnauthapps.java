//Task 23
//This task will return only the names of application that are authoritative
<?xml version='1.0' encoding='UTF-8'?>
<!DOCTYPE Rule PUBLIC "sailpoint.dtd" "sailpoint.dtd">
<Rule created="1564349609211" id="402881096c3987ce016c3a80b4fb0023" language="beanshell" modified="1564370089630" name="Task 23">
  <Description>This rule is only for testing.</Description>
  <Source>
  import sailpoint.object.Application;
  import sailpoint.object.Identity;
  import java.util.List;
  import java.util.ArrayList;
  import sailpoint.object.*;
  
  List apps = context.getObjects(Application.class);
  List list = new ArrayList();
  for (Application app:apps){
    boolean result = app.isAuthoritative();
    if(result==true){ 
      String appname = app.getName(); /* it will get name of the applications that are from authoritative source */
      list.add(appname); //names will be added in the list
      }
  }
  Map map=new HashMap();
  for (String appname:list){ //list will be iterated
 		 Filter myFilter = Filter.eq("links.application.name", appname);
  
  	 QueryOptions qo = new QueryOptions();

		 qo.addFilter(myFilter);
    
    List identityList = context.getObjects(Identity.class, qo); //only the application that matches the appname will filtered to the identityList
    List identyNameList=new ArrayList();
    for (Identity iden:identityList){
    identyNameList.add(iden.getName());
    
    }
    map.put(appname,identyNameList);
    
  }
 	return map;
  </Source>
</Rule>
