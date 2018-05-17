/**
 *
 */

$(function(){


	$('.totalPrice').each(function(i,elem){

		var insertDate = $(elem).attr('data-date');

		var totalPrice = parseInt($(elem).text());

		$('.addPrice').each(function(index,element){


			if(insertDate == $(element).attr('data-date')){

				totalPrice += parseInt($(element).text());

			}

		});


		$(elem).text(totalPrice);


	});



});