<script setup>

</script>

<template>
    <div class="container">
        <div class="white"></div>
        <div class="panel">

            <div class="box sider">
                <!-- 作者信息 -->
                <div class="allsider author">
                    <div class="author-avatar" id="avatar"></div>
                    <div class="author-name" id="name">Gwen</div>
                    <div class="author-slogan" id="slogan">
                        Always believe that someting wonderful will be happen
                    </div>
                </div>

                <!-- 联系方式 -->
                <div class="allsider contract">
                    <!-- github -->
                    <div><a href="https://github.com/mi6661">
                        <img src="./assets/images/icons/github.png">
                    </a></div>
                    <!-- email -->
                    <div><a href="mailto:gulu24257@gmail.com">
                        <img src="./assets/images/icons/email.png">
                    </a></div>
                </div>
                <!-- 目录 -->
                <div class="allsider menu">
                    <ul>
                        <li>
                            <img src="./assets/images/icons/home.png">
                            <p>主页</p>
                        </li>
                        <li>
                            <img src="./assets/images/icons/about.png">
                            <p>关于</p>
                        </li>
                        <li>
                            <img src="./assets/images/icons/essay.png">
                            <p>文章</p>
                        </li>
                        <li>
                            <img src="./assets/images/icons/friend.png">
                            <p>好友</p>
                        </li>
                        <li>
                            <img src="./assets/images/icons/website.png">
                            <p>网站</p>
                        </li>
                        <li>
                            <img src="./assets/images/icons/portal.png">
                            <p>传送门</p>
                        </li>
                    </ul>
                </div>
            </div>

            <div class="box main">Content</div>

        </div>
    </div>
</template>

<style scoped>
.container{
    width: 100%;
    height: 100%;
    overflow: scroll;
}
.white{
    width: 100%;
    height: 60%;
    top: 40px;
}
.panel{
    display: flex;
    width: 100%;
    height: 100%;

    justify-content: center;
}
.box{
    padding: 20px;
    text-align: center;
    color: white;
}

.sider{
    background-color:  rgb(67, 187, 243,0.3);
    border-radius: 10px;
    width: 25%;
    /* 设置毛玻璃效果 */
    backdrop-filter: blur(10px);
}
.allsider{
    width: 100%;
}
/* 边栏-作者信息 */
.author{
    display: flex;
    flex-direction: column;
    align-items: center;
}
.author-avatar{
    background-image: url("./assets/images/head.jpg") ;
    background-repeat: no-repeat;
    background-size: 100%;
    background-position: center;

    width: 120px;
    height: 120px;
    border-radius: 60px;
}
.author-name{
    font-size: x-large;
}
.author-slogan{
    text-wrap: wrap;
    font-family: Snell Roundhand, cursive;
    font-size: medium;
}
/* 边栏-联系方式 */
.contract{
    display: flex;
    justify-content: center;
}
.contract div{
    width: 50px;
    height: 50px;
    border-radius: 10px;
    margin: 10px;
    background-color: rgb(255, 228, 196,0.2);
    /* 设置图标水平垂直居中 */
    display: flex;
    justify-content: center;
    align-items: center;
}
.contract img{
    width: 40px;
    height: 40px;
}

/* 边栏-目录 */
.menu{
    display: flex;
    justify-content: center;
}
.menu ul{
    list-style-type: none;
    padding-left: 0;
    display: flex;
    flex-direction: column;
}
.menu li{
    background-color: rgb(255, 228, 196,0.2);
    margin-bottom: 10px;
    width: 150px;
    height: 50px;
    border-radius: 10px;

    display: flex;
    justify-content: center;
    align-items: center;
}
.menu li img{
    width: 30px;
    height: 30px;
}

/* 内容页面 */
.main{
    background-color: rgb(255, 255, 255,0.6);
    backdrop-filter: blur(10px);
    width: 75%;
}




.menu li:hover{
    /* 引用@keyframes定义的动画 */
    animation-name: menu-items;
    /* 动画的的时间 */
    animation-duration: 0.5s;
    /* 动画曲线 */
    animation-timing-function:ease;
    /* 动画开始前的延迟时间 */
    animation-delay: 0s;
    /* 动画播放次数 */
    animation-iteration-count: 1;
    /* 是否反向播放动画 */
    /*animation-direction: null;*/
    /* 保持最后一帧状态 */
    animation-fill-mode: forwards;
}

/* 按钮渐变动画 */
@keyframes menu-items{
    from{
        background-color:  rgb(255, 228, 196,0.2);
        transform: translateY(0);
    }
    to{
        background-color: rgb(255, 228, 196,0.6);
        transform: translateY(-2px);
    }
}

/* 组件抖动动画 */
@keyframes shake{
    from {
        transform: translateY(5px);
        opacity: 0;
    }
    to {
        transform: translateX(0%);
        opacity: 1;
    }
}
</style>
