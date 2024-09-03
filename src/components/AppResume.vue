<template>
    <h1 class="resume-title">My Resume</h1>
    <div class="basic-content">
        <div class="left-section">
        <img src="https://i.postimg.cc/hv4xL0nn/2024-09-03-4-48-33.png" alt="Person Image" class="centered-image">
        </div>
        <div class="right-section">
            <p>26 歲<br>國立中央大學<br>資訊工程研究所</p>
        </div>
    </div>
    <div class = "divider" style="margin-top: 10px;"></div>
</template>
<script>
export default {
  name: 'AppResume',
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
        height: 100vh; /* 根據需要調整高度 */
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
        max-width: 80%; /* 調整圖片最大寬度 */
        max-height: 80%;
        object-fit: cover; /* 保持圖片比例 */
    }

    .right-section p {
        text-align: center;
        font-size: 24px; /* 根據需要調整字體大小 */
        line-height: 1.5;
        color: #deb992; /* 根據設計需求調整顏色 */
    }
</style>