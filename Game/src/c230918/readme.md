# 네트워크란?
- 연결망
-통신자체를 네트워크라 말할 수 있다.
- 서버끼리의 연결

# 서버란?
- 컴퓨터? 어떤? 저장공간?
- 요청을 받고 응답을 내보내주는 컴퓨터
- 외부에서 접근 가능한 컴퓨터

# 포트란?
- 일련번호? << 맥주소
- 접근 가능하게 하는 권리
- 문, 외부에서 접근할 수 있도록, 내 컴퓨터에 들어올 수 있도록 열어두는 문

## 대표적인 포트
- 80 : HTTP* << 웹 프로토콜
- 443 : HTTPS* << 인증된 웹 프로토콜
- 22 : SSH* << 배포
- 1521 : Oracle 
- 3306 : mySQL

# 도메인
- 배포할 때 접근하기 쉽게 하기 위해 사용
- naver.com : 223.130.200.104:443
- 서울시 천호동 어쩌구 저쩌구 : 경도 몇도 위도 몇도
- aws는 위탁 업체 느낌
- com, kr, net, org 이런것들을 최상위 도메인이라고 부름
- 최하위.하위.상위.최상위.(com|org|net|kr 등등)
  - co.kr << 합쳐서 창상위일까? kr(한국에서만 사용됨.그래서 aws에 없음)만 사면 됨! co.kr 같이 안사도됨
  - co.kr << 이건 기업
  - pe.kr << personal 요건 개인 
  
# HTTP
- HyperText Transfer Protocol
- 브라우저에서 통신하는 규칙

## HTTPS
- HTTP + Secure
- 인증된 HHTP 통신
- SSL 인증 방식을 사용한다.
  - Let'sEncrypyto | certbot
  - AWS에서는 호스팅 영역이 있을 시 자동 인증 지원(유료)
  
# HTML
- HyperText MarkUp Language
- 웹페이지의 출력 담당, 구조만 있을 뿐 플로우는 없다.


```html
<html>
   <head>
      <title>HTML이란</title>
   </head>
   <body>
      <div>
      어쩌구 저쩌구
      </div>
   </body>
</html>

```

# CSS
- CasCading Style Sheets
- 웹페이지의 모양을 담당한다.

# javascript
- 웹페이지의 로직을 담당한다.
- java와는 이름만 연관있다.
- java = Oracle에서 만듦 javascript = Mozila에서 만듦
- 예전이름 Mocha > Javascript 인기 얻으려고 바꿨다.

```html
<html>
   <head>
   <meta charset = "UTF-8"/>
      <title>제목</title>
      <script>
         javascript입력~
      </script>
      <script src = "자바스크립트 파일의 주소"></script>
      <style>
         CSS 내용 입력
      </style>
      <link href="CSS 파일 주소" rel="stylesheet" />
   </head>
   <body>
      <div>
         내용~
      </div>
   </body>
   
</html>
```

# java에서의 Web Server Open?
- Tomcat을 사용한다.
  - port : 8888
  - admin / admin
  
# Server
## Web Server
- Web으로 연결을 한다?
- Web을 주는 서버

## Application Server
- Data를 주는 서버

## DB Server

## Web Application Server
- WAS

# Tomcat
- Apache를 기반으로 돌아가는 서버 프로그램
- PHP로 되어있다.
- WAS

## Apache
- Web Server
- PHP 를 사용해서 WAS 처럼 쓸 수 있다.

# 잡설(javascrtpt)
- javascript는 인터프리터 언어, 세상에서 가장 빠른 프로그래밍 언어(C보다는 느릴 거 같다.)
- OS 상에서 사용하는 것이 아닌 브라우저 상에서 사용하는 것을 기본으로 하고있다.
- Node.js << OS에서 Javascript를 실행할 수 있게 해준다.
- Node.js 기반으로 React 라이브러리를 사용할 수 있다.
- React 라이브러리는 View만을 위한 javascript 라이브러리.
- 이외에도 Vue.js, Angular.js라는 프레임워크가 있다.
  - Angular.js는 죽었다.
  - React VS Vue.js
- 위 내용은 전부 순수 FrontEnd(Web Server) 쪽 기술이다.
- Node.js를 사용한 백엔드 가능 

# OSI 7계층 | TCP/IP 5계층
- 7층(5층) HTTP, Web socket (요청을 안보내면 안됌, 요청과 응답으로, 기반은 소켓통신)
- 6층(4층) socket (데이터를 항상 언제든 주고받을 수 없다. 제한이 없다 ex)카카오톡 채팅할 때 한 사람만 주구장창 메세지를 보내는것과 같은 느낌)(보통은 C++로 많이 한다)
- 5층(4층) TCP | UDP
- 4층 IP

# Tomcat 실행
- Windows : tomcat9\bin\tomcat9.exe
- Mac : tomcat9/bin 에서 startup.sh 실행

