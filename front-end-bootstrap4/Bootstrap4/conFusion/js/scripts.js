$(document).ready(function () {
    
    $('#myCarousel').carousel({ interval: 2000 }); //set sliding interval to 2000 ms.

    /*    $('#carouselPause').click(function() {
            $('#myCarousel').carousel('pause'); //pause carousel sliding on-clicking pause
        });

        $('#carouselPlay').click(function() {
            $('#myCarousel').carousel('cycle'); //resume carousel sliding on-clicking play
        });
    */

    $('#carouselButton').click(function () {
        if ($('#carouselButton').children('span').hasClass('fa-pause')) {
            $('#myCarousel').carousel('pause');
            $('#carouselButton').children('span').removeClass('fa-pause');
            $('#carouselButton').children('span').addClass('fa-play');
        }
        else if ($('#carouselButton').children('span').hasClass('fa-play')) {
            $('#myCarousel').carousel('cycle');
            $('#carouselButton').children('span').removeClass('fa-play');
            $('#carouselButton').children('span').addClass('fa-pause');
        }
    });

});


$('#reserveTableButton').click(function() {
    $('#reserveModal').modal('toggle');
});

$('#loginButton').click(function() {
    $('#loginModal').modal('toggle');
});
