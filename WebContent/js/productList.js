/**
 *
 */

$(function(){

	$('.product-box').hover(
	function(){

		$(this).find('.product-box-top').stop(true).animate({

			'width' : '100%'

		},300);

		$(this).find('.product-box-left').stop(true).animate({

			'height' : '100%'

		},300);

		$(this).find('.product-box-right').stop(true).animate({

			'height' : '100%'

		},300);

		$(this).find('.product-box-bottom').stop(true).animate({

			'width' : '100%'

		},300);

	},
	function(){

		$(this).find('.product-box-top').stop(true).animate({

			'width' : '0%'

		},300);

		$(this).find('.product-box-left').stop(true).animate({

			'height' : '0%'

		},300);

		$(this).find('.product-box-right').stop(true).animate({

			'height' : '0%'

		},300);

		$(this).find('.product-box-bottom').stop(true).animate({

			'width' : '0%'

		},300);


	});





});