import jQuery from 'jquery';
class Loading{
    show(){
        if(jQuery('#loadingDiv,#loadingDivChild').length>0){
            jQuery('#loadingDiv,#loadingDivChild').remove();
        }
        jQuery('body').append('<div id="loadingDiv" style="width:100%;height:100%;top:0px;bottom:0;left:0px;right:0; z-index:100;position:fixed; opacity:.5;filter:alpha(opacity=50);background-color:#000;"></div>');
        jQuery('body').append('<div id="loadingDivChild" style="width:100%;height:100%;top:0px;bottom:0;left:0px;right:0; z-index:100;position:fixed;"><img  style="position:absolute;" src="http://pic.c-ctrip.com/common/loading_100.gif"/></div>');
        var top=jQuery('#loadingDivChild').height()/2-jQuery('#loadingDivChild>img').height()/2;
        var left=jQuery('#loadingDivChild').width()/2-jQuery('#loadingDivChild>img').width()/2;
        jQuery('#loadingDivChild>img').css('top',top+'px');
        jQuery('#loadingDivChild>img').css('left',left+'px');
    }
    hide(){
        if(jQuery('#loadingDiv,#loadingDivChild').length>0){
            jQuery('#loadingDiv,#loadingDivChild').remove();
        }
    }
}

export default new Loading();