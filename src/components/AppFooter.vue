<template>
    <footer id="footer" v-show="isFooterVisible" class="app-footer">
        <div class="contact-info">
            <p><font-awesome-icon icon="phone" /> : 0979129120</p>
        </div>
        <div class="contact-info">
            <p><font-awesome-icon icon="envelope" /> : superjack870610dd@gmail.com</p>
        </div>
    </footer>
</template>

<script>
    export default {
        name: 'AppFooter',
        props: {
            isFooterVisible: {
                type: Boolean,
                default: false
            }
        },
    };
</script>

<style scoped>
.app-footer {
    display: flex;
    z-index: 2;
    position: fixed;
    margin-top: 0px;
    justify-content: center;
    background-color: #0A1828;
    color: #deb992;
    text-align: center;
    padding: 20px;
    width: 100%;
    height: 150px;
    bottom: 0;
    left: 0;
    box-sizing: border-box;
}
.contact-info{
    margin-left: 30px;
    margin-top: 30px;

}
</style>
  