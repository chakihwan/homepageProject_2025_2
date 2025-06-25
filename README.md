# 💜 차주원 홈페이지 (Spring Boot + Thymeleaf 프로젝트)

본 프로젝트는 Spring Boot와 Thymeleaf를 활용하여 제작한 개인 홈페이지입니다.  
'차주원'이라는 아이의 성장과 사랑을 기록하는 공간으로, 정적인 콘텐츠 구성과 인증 기능(Security 로그인)까지 포함되어 있습니다.

---

## 👨‍💻 개발자 정보

- **이름**: 차기환
- **이메일**: rlghks0720@gmail.com
- **학교**: 한국폴리텍대학 서울정수캠퍼스
- **학과**: 인공지능소프트웨어과

---

## 🛠️ 사용 기술 스택

| 분류           | 기술명 |
|----------------|--------|
| 백엔드         | Java 17, Spring Boot 3.5 |
| 프론트엔드     | HTML5, CSS3, JavaScript (Vanilla) |
| 템플릿 엔진    | Thymeleaf |
| 인증 보안      | Spring Security (InMemory 로그인) |
| 빌드 도구      | Gradle |
| 개발 도구      | IntelliJ IDEA |

---

## 📂 디렉토리 구조 (주요)
```
src
├── main
│ ├── java
│ │ └── kr.ac.kopo.kihwan.homepageproject_2025_2
│ │ ├── config # Security 설정
│ │ └── controller # 페이지 매핑 컨트롤러
│ └── resources
│ ├── static
│ │ ├── css # CSS 파일 저장
│ │ └── imgs # 이미지 파일 저장
│ └── templates # Thymeleaf 템플릿(html)
└── build.gradle

```
---

## 🌐 주요 기능
```
| 기능         | 설명 |
|--------------|------|
| 🔐 로그인 기능 | Spring Security로 로그인 구현 (`/login`) - `admin / 1234` |
| 🏠 메인 페이지 | 메인 이미지 슬라이드 + hover 메뉴 구성 (`/home`) |
| 👶 주원이 소개 | 기본 프로필 소개 (`/home/intro`) |
| 📘 성장일지    | 주원의 성장 과정을 시각적으로 보여줌 (`/home/growth-log`) |
| 📸 사진첩      | 주원의 귀여운 사진들을 갤러리 형식으로 제공 (`/home/photo-album`) |
| 📱 Contact     | 인스타그램 및 블로그 등의 링크 제공 (`/home/contact`) |
| 🚪 로그아웃   | 우측 상단 로그아웃 버튼 제공 (form post 방식) |
```
---

## 📁 파일 이름 매핑
```
| HTML 템플릿           | 경로                        | 연결 CSS                |
|------------------------|-----------------------------|--------------------------|
| `login.html`           | `/templates/login.html`     | (기본 스타일 사용)       |
| `main.html`            | `/templates/main.html`      | `stylesMain.css`         |
| `intro.html`           | `/templates/intro.html`     | `stylesIntro.css`        |
| `growth-log.html`      | `/templates/growth-log.html`| `stylesGrowth.css`       |
| `photo-album.html`     | `/templates/photo-album.html`| `stylesPhoto.css`       |
| `contact.html`         | `/templates/contact.html`   | `stylesContact.css`      |
```

---

## 💬 참고 사항
- 로그인 없이 접근 시 /login으로 리디렉션됩니다.

- 아이디/비밀번호는 admin / 1234입니다.

- 추후 DB 연동 및 사용자 게시판 추가 가능성을 염두에 두고 설계되었습니다.
