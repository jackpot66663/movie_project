<template>
    <div class="resume-container" style="margin-bottom: 300px;">
    <h1 class="resume-title">My Resume</h1>
    <div class="basic-content">
        <div class="left-section">
        <img src="https://i.postimg.cc/hv4xL0nn/2024-09-03-4-48-33.png" alt="Person Image" class="centered-image">
        </div>
        <div class="right-section">
            <p>26 歲<br>國立中央大學<br>資訊工程研究所</p>
        </div>
    </div>
    <div class = "divider" style=""></div>
    <br>
    <h2 class="work-title">Work Experience</h2>
    <div class="experience-container">
        <div class="timeline">
            <div class="circle"></div>
            <div class="line"></div>
        </div>
        <div class="experience-content">
            <div class="experience-header">
            <h2 style="color: #deb992;">RD 實習生</h2>
            <span style="margin-left:100px">意藍資訊股份有限公司</span>
            <img src="https://i.postimg.cc/4d07cRW6/eland.png" alt="Company Logo" class="company-logo">
            </div>
            <p class="date-range">Jan. 2020 ~ Oct. 2020</p>
            <ul class="experience-details">
                <li>站台維運：使用 JS 以及 JQuery 處理網頁事件邏輯，修正按鈕事件或者篩選條件參數之錯誤</li>
                <li>功能開發：使用 Java 在 Spring 框架下的後端系統新增搜尋功能，使用者可透過時間範圍獲得各社群平台熱度文字雲</li>
                <li>API 串接：使用 Postman 測試並使用 AJAX 串接後端資料，維護站台資料之正確性</li>
                <li>站台測試：使用 Java Selenium 撰寫站台自動化監測專案，讓公司優先一步客戶獲得站台錯誤，提升服務品質</li>
            </ul>
        </div>
    </div>
    <br>
    <br>
    <br>
    <div class = "divider" style=""></div>
    <br>
    <h2 class="work-title">Extracurricular Activities</h2>
    <div class="experience-container">
        <div class="timeline">
            <div class="circle"></div>
            <div class="line"></div>
        </div>
        <div class="experience-content">
            <div class="experience-header">
            <h2 style="color: #deb992;">系上春酒總召</h2>
            <span style="margin-left:100px">輔仁大學資工系學會</span>
            <img src="https://i.postimg.cc/8CFNNpcV/eat.png" alt="Activity Pic" class="activity-pic">
            </div>
            <p class="date-range">Jan. 2019 ~ Mar. 2019</p>
            <ul class="experience-details">
                <li>活動籌辦：實地勘察餐廳、組織暖場活動安排</li>
                <li>經費管理：管理如場地費、餐費、音控等支出</li>
            </ul>
        </div>
    </div>
    <div class="experience-container">
        <div class="timeline">
            <div class="circle"></div>
            <div class="line"></div>
        </div>
        <div class="experience-content">
            <div class="experience-header">
            <h2 style="color: #deb992;">社長</h2>
            <span style="margin-left:100px">北市延平高中熱舞社</span>
            <img src="https://i.postimg.cc/mkWbmvbW/dance.png" alt="Activity Pic" class="activity-pic" style="margin-left:280px;">
            </div>
            <p class="date-range">Sep. 2014 ~ Jun. 2015</p>
            <ul class="experience-details">
                <li>演出活動：代表參加各校展演、之夜、成發之演出</li>
                <li>活動籌辦：舉辦社團博覽會、之夜活動，並負責表演安排</li>
                <li>成員訓練：培養以及訓練學弟妹之舞蹈技術</li>
            </ul>
        </div>
    </div>
    <br>
    <br>
    <br>
    <div class = "divider" style=""></div>
    <br>
    <h2 class="work-title">Project</h2>
    <div class="project-container">
        <h2 style="color: #deb992;">生成式AI程式設計系統</h2>
        <img src="https://i.postimg.cc/ydgpcNKT/1-1.png" alt="Project Pic" class="project-pic">
        <div>
            <ul class="project-details">
                <li>Purpose : 幫助學生運用生成式AI於程式設計，非單純輔助學習程式設計</li>
                <li>Period : 2024/04 - 2024/06</li>
                <li>Core :  以運算思維運用生成式AI，提高學生程式設計之效率</li>
                <li>Conclusion : 學生平均成績成長17％</li>
            </ul>
        </div>
        <h3 style="color: #deb992;">系統架構</h3>
        <img src="https://i.postimg.cc/SNdnYShM/structure.png" alt="Project Pic" class="project-pic">
    </div>
    <br>
    <br>
    <br>
    <div class = "divider" style=""></div>
    <br>
    <h2 class="work-title">Self-introduction</h2>
    <div class="introduce-container">
        <div>
        <button @click="toggle_team">溝通以及合作</button>
        <button @click="toggle_learn">樂於學習</button>
        <button @click="toggle_intern">Java Web 開發</button>
        <button @click="toggle_ai">生成式 AI 程式設計系統開發 </button>
        <button @click="toggle_career">職涯目標</button>
        </div>
        <br>
        <div class="display_intro" v-if="show_team">
            <p style="font-size: 18px;line-height: 1.5;">
                我樂於團隊合作的人，不管是在高中時的社團，或者大學時的系學會，皆熱衷於參加活動的籌備以及組織工作，其中大三舉辦的系上春酒活動，擔任總召一職，了解到團體合作中最重要的即為溝通，透過各職位的互相協調，清楚傳達彼此的意見，才能妥善地完成任務，而從中除了溝通技巧的提升之外，更是訓練活動企劃以及領導能力。
            </p>
        </div>
        <div class="display_intro" v-if="show_learn">
            <p style="font-size: 18px;line-height: 1.5;">
                我也樂於學習新知識，在製作畢業專題中，雖平常運用到的程式語言為C++ 和 Java，但因遊戲建模有別於以往所學，透過自學利用 C# 製作出人物的影子和足跡功能以及利用 3DS Max 建立武器模型，此外，因個人興趣為畫畫，畢專期間學習 Illustrator 來設計圖文，正好幫助到畢專發表的宣傳製作海報上。
            </p>
            <div class="img-container">
                <img src="https://i.postimg.cc/D0V2KNLq/2024-09-03-3-14-19.png" alt="Ill Pic" class="ill-pic">
            </div>
        </div>
        <div class="display_intro" v-if="show_intern">
            <p style="font-size: 18px;line-height: 1.5;">
                大學期間透過在公司的資訊研究部實習，獲得更全面的程式設計技巧以及框架設計知識。
            </p>
            <li>熟悉以 Spring MVC 為框架之站台系統，負責維運網頁之間的資料傳遞。</li>
            <li>熟悉 JS、JQuery，負責處理網頁事件邏輯如按鈕所觸發之AJAX。</li>
            <li>以 Java Selenium 撰寫自動化監測專案，幫助公司優先一步客戶找到站台上的錯誤。</li>
            <li>串接後端 API，與後端工程師討論細節內容，過程中提升溝通技巧以及後端知識。</li>
            <li>以實習所獲得的 Spring Boot 知識開發個人作品集（電影搜尋系統）中的後端。</li>
            <div class="img-container">
                <img src="https://i.postimg.cc/bvJY0kq2/S-38142184.jpg" alt="Intern Pic" class="intern-pic">
            </div>
        </div>
        <div class="display_intro" v-if="show_ai">
            <p style="font-size: 18px;line-height: 1.5;">
                在碩論中，提出以運算思維運用生成式 AI 可幫助未來的人機互動開發，並將假設以 Python Flask 為系統框架實作。
            </p>
            <li>以問題解構為核心，設計系統，幫助學生學習提示工程。</li>
            <li>系統串接 OpenAI API。</li>
            <li>45位學生，歷時兩個月的學習，學生平均成績提升17％。</li>
            <li>除了獲得生成 AI 開發經驗，也從中了解使用者注重的介面體驗為何，幫助未來在系統設計上的品質。</li>
            <div class="img-container">
                <img src="https://i.postimg.cc/NjC9y6xZ/S-38215683.jpg" alt="Intern Pic" class="intern-pic">
            </div>
        </div>
        <div class="display_intro" v-if="show_career">
            <li>在硬實力中，專精於前後端技術的整合與應用，同時更加熟稔部署以及資源配置之能力，成為一名資深的前端工程師。</li>
            <li>在軟實力中，成為部門之間或者客戶之間溝通的橋樑，清楚傳達技術細節，協調各方的意見，促進項目的順利推進。</li>
        </div>
    </div>
    </div>
</template>
<script>

export default {
  name: 'AppResume',
  data() {
    return {
      show_team: true,
      show_learn: false,
      show_intern: false,
      show_career: false,
      show_ai:false
    };
  },
  methods: {
    toggle_team() {
        this.show_team = true;
        this.show_learn = false;
        this.show_intern = false;
        this.show_career = false;
        this.show_ai = false;
    },
    toggle_learn(){
        this.show_team = false;
        this.show_learn = true;
        this.show_intern = false;
        this.career = false;
        this.show_ai = false;
    },
    toggle_intern(){
        this.show_team = false;
        this.show_learn = false;
        this.show_intern = true;
        this.show_career = false;
        this.show_ai = false;
    },
    toggle_career(){
        this.show_team = false;
        this.show_learn = false;
        this.show_intern = false;
        this.show_career = true;
        this.show_ai = false;
    },
    toggle_ai(){
        this.show_team = false;
        this.show_learn = false;
        this.show_intern = false;
        this.show_career = false;
        this.show_ai = true;
    }
  }
};
</script>
<style scoped>
    .resume-title{
        font-family: BrandonGrotesqueWeb-Thin, sans-serif;
        color: #deb992;
        font-size: 80px;
        font-weight: 100;
    }
    .basic-content{
        display: flex;
        margin-top: 0px;
        justify-content: center;
        align-items: center;
        height: 80vh; /* 根據需要調整高度 */
        padding: 0 10%;
    }
    .left-section, .right-section {
        flex: 0.4;
        display: flex;
        justify-content: center;
        align-items: center;
        padding: 10px;
    }

    .centered-image {
        max-width: 70%; /* 調整圖片最大寬度 */
        max-height: 70%;
        object-fit: cover; /* 保持圖片比例 */
    }

    .right-section p {
        text-align: center;
        font-size: 24px;
        line-height: 1.5;
        color: #deb992;
    }
    .experience-container {
        display: flex;
        margin-top: 0px;
        justify-content: left;
        margin-left: 300px;
        font-family: 'Arial', sans-serif;
    }

    .timeline {
        position: relative;
        margin-right: 20px;
    }

    .circle {
        width: 12px;
        height: 12px;
        background-color: #deb992;
        border-radius: 50%;
        margin-top: 5px;
    }

    .line {
        width: 2px;
        height: 95%;
        background-color: #deb992;
        position: absolute;
        top: 15px;
        left: 5px;
    }

    .experience-content {
        max-width: 900px;
        margin-left: 20px;
    }

    .experience-header {
        display: flex;
        align-items: center;
        justify-content: space-between;
    }

    .experience-header h2 {
        font-size: 24px;
        margin: 0;
        font-weight: bold;
    }

    .experience-header span {
        font-size: 18px;
        margin-left: 20px;
        color: #deb992;
    }

    .company-logo {
        height: 100px;
        margin-left: 300px;
    }

    .activity-pic{
        height: 200px;
        margin-left: 200px;
    }

    .date-range {
        font-size: 16px;
        color: #deb992;
        margin-top:20px;
    }

    .experience-details {
        list-style-type: disc;
        padding-left: 20px;
        font-size: 18px;
        margin: 10px 0;
    }
    .experience-content li{
        color: #deb992;
        margin-top: 10px;
    }
    .work-title{
        color: #deb992;
        font-size: 50px;
        font-weight: 100;
        font-family: BrandonGrotesqueWeb-Thin, sans-serif;
        margin-left:300px;
        margin-top: 50px;
    }
    .project-container{
        /* display: flex; */
        margin-top: 0px;
        justify-content: center;
        align-items: center;
        height: auto;
        margin-left: 300px;
    }
    .project-details li{
        color:#deb992;
        font-size: 20px;
        margin-top: 10px;
    }
    .project-pic{
        width: 800px;
    }
    .introduce-container{
        color: #deb992;
        margin-top: 0px;
        justify-content: left;
        margin-left: 300px;
        font-family: 'Arial', sans-serif;
        width: 900px;
    }
    .introduce-container button{
        padding: 10px 20px;
        font-size: 24px;
        color: #BFA181;
        background-color: #0A1828;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
    .introduce-container button:hover{
        color: #fff;
    }
    .img-container{
        display: flex;         
        justify-content: center;
        align-items: center;
        margin-top: 50px;
    }
    .intern-pic{   
        width: 400px;
        height: auto;
    }

    .ill-pic{
        width: 400px;
        height: auto;
    }

    

</style>