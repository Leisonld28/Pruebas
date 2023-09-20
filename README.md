# oneapp_web
mvn -Dproperties=$(pwd)/serenity.properties \
-D"cucumber.filter.tags=@OneAppServicios_home" clean test && \
 mvn serenity:aggregate
 

