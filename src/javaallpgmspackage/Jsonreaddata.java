//package javaallpgmspackage;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//
//public class Jsonreaddata {
//
//	public static void main(String[] args) throws JSONException {
//		// TODO Auto-generated method stub
//		
//		
//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\nshibaha\\Desktop\\WORK\\AUTOMATION\\drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nshibaha\\Desktop\\WORK\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
//		  
//		 //ChromeDriver driver = new ChromeDriver();
//		  
//			//System.setProperty("http.proxyHost", "localhost, 127.0.0.1");
//		 
//		 	System.setProperty("https.proxyHost", "proxy-chain.intel.com");
//			System.setProperty("http.proxyPort", "911");
//			System.setProperty("https.proxyPort", "912");
//
//		
//		  String idzpublisherpageiqa4="https://int5-software.intel.com/en-us/migration/node/755200";
//			        driver.get(idzpublisherpageiqa4);
//
//			       //driver.getWindowHandle().
//
//			        //JsonParser parser = new JSONParser();
//			       // driver.manage().window().maximize();
//			        String text = driver.findElement(By.cssSelector("pre")).getText();
//			       // System.out.println(text);
//			        
//			        //JSONArray a = (JSONArray) parser.parse(text);
//			        JSONObject jsonobject = new JSONObject(text);
//			        
//			        
//			        
//			        //JSONObject object = new JSONObject(myJSONString);
//			        String[] keys = JSONObject.getNames(jsonobject);
//			        
//			        ArrayList<String> keylist = new ArrayList<String>();
//			        ArrayList<String> valuelist = new ArrayList<String>();
//
//			       
//			        
//			 /*       for (String key : keys)
//			        {
//			            Object value =  jsonobject.get(key);
//			            
//			            String stringvalue =value.toString();
//			            keylist.add(key);
//			            valuelist.add(stringvalue);
//			            
//			            
//			            hashobj.put(key, stringvalue);
//			            //key
//			            
//			            //System.out.println("Values are : "+value);
//			            // Determine type of value and do something with it...
//			        }*/
//			        
//			      //  System.out.println("All keys list "+keylist);
//			       // System.out.println("All Values list "+valuelist);
//			        
//			       // System.out.println("hashobj Map value "+hashobj.entrySet());
//			        
//			       // System.out.println("Pblication info value "+hashobj.get("publication_info"));
//			        
//			        
//			        
//			        HashMap<String,String >  hashobj = new HashMap <String,String>();
//			        
//			        String drupal_node_id =jsonobject.getString("drupal_node_id");
//			        
//			        String title =jsonobject.getString("title");
//			        
//			        JSONObject publication_infoobj = jsonobject.getJSONObject("publication_info");
//				     
//			        String published_date = publication_infoobj.getString("published_date");
//			        String last_updated_date = publication_infoobj.getString("last_updated_date");
//			        //String in_page_navigation = jsonobject.getString("in_page_navigation");
//			        
//			        boolean in_page_navigationboo=   jsonobject.getBoolean("in_page_navigation");
//			       
//			        String in_page_navigation=Boolean.toString(in_page_navigationboo);
//			        
//			        System.out.println("in_page_navigation  "+in_page_navigation);
//			        
//			        JSONObject menu = jsonobject.getJSONObject("menu");
//				     
//			        String drupal_taxo_id = menu.getString("drupal_taxo_id");
//			        String language =jsonobject.getString("language");
//			        String summary =jsonobject.getString("summary");
//			        String body =jsonobject.getString("body");
//			        String format =jsonobject.getString("format");
//			        String iconimage =jsonobject.getString("icon_image");
//			        
//			        System.out.println("ICON Image "+iconimage);			        
//			        
//			        JSONObject sticky_button = jsonobject.getJSONObject("sticky_button");
//			        
//			        String sticky_button_color =sticky_button.getString("sticky_button_color");
//			        String sticky_button_url =sticky_button.getString("sticky_button_url");
//			        String sticky_button_text =sticky_button.getString("sticky_button_text");
//			        
//			        //JSONObject sticky_button = jsonobject.getJSONObject("sticky_button");
//
//			          // String sticky_button_color =sticky_button.getString("sticky_button_color");
//
//			            //boolean isIdNull = sticky_button.get("sticky_button_color").isJsonNull();
//
//			            boolean isIdNullsticky_button_color = sticky_button.isNull("sticky_button_color");
//			            //boolean jsonUtils = JSONUtils.isNull(jsonObject.get("parentId"));
//			           // boolean sticky_button_colorboo=   sticky_button.get("sticky_button_color")
//
//			           //String sticky_button_color=Boolean.toString(sticky_button_colorboo);
//
//			            
//			            if(isIdNullsticky_button_color ==true)
//			            {
//			            	System.out.println("sticky_button_colorisid null  remove it");
//			            }
//			            
//			            
//			            System.out.println("sticky_button_colorisid null " +isIdNullsticky_button_color);
//			        
//			        
//			        
//			        //JSONObject metadataobj = jsonobject.getJSONObject("metadata");
//			        JSONArray metadataobjarray = jsonobject.getJSONArray("metadata");
//			        
//			        String operating_system =metadataobjarray.getString(1);
//			        String related_content =jsonobject.getString("related_content");
//			        String alias =jsonobject.getString("alias");
//			 
//			        hashobj.put("drupal_node_id", drupal_node_id);
//			        hashobj.put("title", title);
//			        hashobj.put("published_date", published_date);
//			        hashobj.put("last_updated_date", last_updated_date);
//			        hashobj.put("in_page_navigation", in_page_navigation);
//			        hashobj.put("language", language);
//			        hashobj.put("summary", summary);
//			        hashobj.put("body", body);
//			        hashobj.put("format", format);
//			        hashobj.put("sticky_button_color", sticky_button_color);
//			        hashobj.put("sticky_button_url", sticky_button_url);
//			        hashobj.put("sticky_button_text", sticky_button_text);
//			        hashobj.put("operating_system", operating_system);
//			        hashobj.put("related_content", related_content);
//			        hashobj.put("alias", alias);
//			        
//			       // System.out.println("hashobj entry set " +hashobj.entrySet());
//			        
//			        
//			        
//			    /*    
//			        
//			        System.out.println("Druapl node id :"+jsonobject.getString("drupal_node_id"));
//			        System.out.println("Title :"+jsonobject.getString("title"));
//			        
//			        hashobj.put("drupal_node_id", drupal_node_id);
//			        
//			        
//			        
//			       System.out.println("publication_info "+jsonobject.getString("publication_info"));
//			        
//			       String technostring;
//			       try {
//			    	    technostring =jsonobject.getString("technology");
//			        } catch (JSONException e) {
//			            
//			        	technostring="null";
//			        	
//			        	System.out.println("technostring" +technostring);
//			        }
//			       
//			       
//			       System.out.println("technostring"+technostring);
//			       
//			     //  JSONObject publication_infoobj = jsonobject.getJSONObject("publication_info");
//			       
//			       //publication_infoobj.getNames(jo)
//			       
//			      // String published_date = publication_infoobj.getString("published_date");
//			       
//			       System.out.println("published_date" +published_date);
//			       
//			       JSONObject attachmentsobj = jsonobject.getJSONObject("attachments");
//			       String attachmentsstring= attachmentsobj.getString("attachments_fid");
//			       
//			       System.out.println("attachmentsstring" +attachmentsstring);
//			       
//			        
//			        //JSONArray array = jsonobject.getJSONArray("publication_info");
//			        
//			        //System.out.println("array" +array);
//			        for(int i = 0 ; i < array.length() ; i++){
//			            list.add(array.getJSONObject(i).getString("interestKey"));
//			        }
//			        
//			        
//			        //System.out.println("publication_info 1 "+jsonobject.getString("publication_info").indexOf(1));
//			        //System.out.println("last_updated_date "+jsonobject.getString("last_updated_date"));
//			        
//			        
//			        //JSONArray  publication_infoarray     =(JSONArray) jsonobject.get("publication_info");
//			        
//			        //System.out.println(" publication_infoarray " + publication_infoarray.getJSONObject("last_updated_date") );
//			        
//			       // System.out.println("Second :"+jsonobject.toString("publication_info"));
//*/	}
//
//}
