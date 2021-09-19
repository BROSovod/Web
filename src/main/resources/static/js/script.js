$(function(){
    $('#myButton').on('click', function (){
        //alert('hello');

        $.post("/cart", {id:1}, function (data) {
        }).done(function(data) {
            $('#cart').text('Total: ' + data.length);
        }).fail(function (xhr, textstatus, errorThrown) {
            alert('failed');
        })
    })
})