const show = document.getElementById("showList");

//決定是否顯示roomList
let isShow = false;

show.addEventListener("click", () => {
  if (isShow) {
    isShow = !isShow;
  } else {
    isShow = !isShow;
  }
});
