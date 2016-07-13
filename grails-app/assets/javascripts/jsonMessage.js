/**
 * Created by Chayanne on 2016/07/13.
 */

function validateField() {

    var message = $('#message').val();

    if (message.length < 1) {
        $('#error').text("Please enter a message").show();
        return false
    }
}
