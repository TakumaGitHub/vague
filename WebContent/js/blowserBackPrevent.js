/**
 * ブラウザバックを禁止するjavascript
 */

$(function(){

	location.hash = "hash";

	//ハッシュが変わったら
	  $(window).on("hashchange", function(){
	        location.hash = "#prepage2";
	    });


});


