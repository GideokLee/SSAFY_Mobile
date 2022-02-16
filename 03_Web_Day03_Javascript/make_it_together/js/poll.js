window.onload = function () {
  document.getElementById("btn-add").addEventListener("click", function () {
    var listDiv = document.getElementById("poll-answer-list");

    var divEl = document.createElement("div"); // <div></div>
    divEl.setAttribute("class", "poll-answer-item");// <div class="poll-answer-item"></div>
    var inputEl = document.createElement("input");
    inputEl.setAttribute("type", "text");
    inputEl.setAttribute("name", "answer");
    var btnEl = document.createElement("button");
    btnEl.setAttribute("type", "button");
    btnEl.setAttribute("class", "button");
    btnEl.appendChild(document.createTextNode("삭제"));

    btnEl.addEventListener('click', function () {
      var parent = this.parentNode;
      listDiv.removeChild(parent);
    });

    divEl.appendChild(inputEl);
    divEl.appendChild(btnEl);

    listDiv.appendChild(divEl);
  });

  document.getElementById("btn-make").addEventListener("click", function () {
    var question = document.querySelector("#question").value;
    if (!question) {
      alert("투표 내용 입력!!!");
      return;
    }

    var answers = document.getElementsByName("answer");
    for (var i = 0; i < answers.length; i++) { // 유효성 검사(Validation Check)
      if (!answers[i].value) {
        alert("답변 항목 입력!!!!");
        return;
      }
    }

    var answerArr = [];
    for (var i = 0; i < answers.length; i++) {
      answerArr.push(answers[i].value);
    }
    // console.log(answerArr);

    var sd = document.getElementById("sd").value;
    var ed = document.getElementById("ed").value;

    localStorage.setItem("question", question);
    localStorage.setItem("answers", JSON.stringify(answerArr));
    localStorage.setItem("sd", sd);
    localStorage.setItem("ed", ed);

    alert("투표를 생성합니다!!");
    self.close();
    opener.location.reload();
  });
};
