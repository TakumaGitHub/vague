$(function(){


	/*======== スクロールイベント =========*/
	var $window = $(window),
	$scrollButton = $('#scroll-button');

	var threshold = $('header').outerHeight();


	$window.on('scroll',$.throttle(1000 / 15, function(){


		if($window.scrollTop() > threshold){

			//スクロールボタンをスライドイン
			$scrollButton.stop(true).animate({

				'right' : '40px'

			},300);




		}else if($window.scrollTop() <= threshold){

			//スクロールボタンをスライドアウト
			$scrollButton.stop(true).animate({

				'right' : '-55px'

			},300);


		}

	}));


	//一度スクロールイベントを発生させる

	$window.trigger('scroll');

	/* スクロールボタンのスムーズスクロール */

	$scrollButton.on('click',function(){

		$('html,body').animate({

			scrollTop : 0


		},300,'easeInQuad')



	});


	$('.background-image-area').hover(
		function(){


			$('#background-image-box').attr('src',$(this).attr('data-src'));


		},
		function(){

			$('#background-image-box').attr('src',"BackgroundImage/homeBackground.jpg");


		});


});