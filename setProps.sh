#!/bin/bash

echo ""
echo ""
echo "###############################################################################" 
echo "#################### SE CREA CONFIG PARA SERENITY #############################" 
echo "###############################################################################" 
echo "####################################Ã‰o=&I*?IÂ±Â©#################################" 
echo "##################################Ã«&&I%oI&&I=*?Ã‘###############################" 
echo "#################################Â±I&XÂ£Â±XÂ±Â£%*=&*%Ã«##############################" 
echo "################################Ã‘o%XÂ£Ã«@Â±Ã«XÂ£%Â£Â£&*oÂ¶#############################" 
echo "################################XoXÂ±Â£@XÂ£XoÂ±XXXoIoÃ¦#############################" 
echo "################################Â§&XÃ«Ã‘Ã‘Ã‘Â±Â£o%%&Â£Â±oI##############################" 
echo "#################################@&Â±Ã‘Â§Ã‘Ã‘Â£ooÂ±Ã«@Ã‘Â£N##############################" 
echo "##################################N@oÂ£XÂ£&%oÂ£Â£Â£Ã‰################################" 
echo "######################################Ã¦Ã«Â£Ã«Â§N###################################" 
echo "###############################################################################" 
echo ""

SERENITY_PROP_PATH="metis/serenity.properties"

echo "webdriver.chrome.driver=$DRIVER
webdriver.driver=$NAVEGADOR
webdriver.remote.driver=$NAVEGADOR
webdriver.base.url=$URL
#si se quiere que el robot abra el navegador use la siguiente property
#chrome.switches=--start-maximized,--enable-automation,--no-sandbox,--disable-gpu-sandbox
#si se quiere que el robot no abra el navegador use la siguiente property
chrome.switches=--window-size=1920,1080;--headless;
serenity.browser.maximized = true
chrome_preferences.safebrowsing.disable_download_protection=False
chrome_preferences.safebrowsing.enabled=False
chrome_preferences.behavior=allow
chrome_preferences.disable-popup-blocking=true
serenity.project.name=Tigo - OneApp_Web
serenity.dry.run=false 
serenity.verbose.steps=FALSE
serenity.report.encoding=UTF-8
serenity.compress.filenames=true
serenity.console.colors=false
max.retries=1
junit.retry.tests=true
#serenity.take.screenshots.for.tasks=after_each_step
#serenity.take.screenshots.for.interactions=for_failure
#serenity.take.screenshots.for.questions=after_each_step
" > $SERENITY_PROP_PATH