$(document).ready(function () {
	console.log("JS is running");
    var hidepopup = Cookies.get("hidepopup");
    if (hidepopup == null || hidepopup === 'undefined') {
        $(".popup").toggleClass("hidden");
    }

    $(".close").click(function () {
        $(".popup").toggleClass("hidden");
        Cookies.set('hidepopup', 'true', { expires: 1 });
    });
});