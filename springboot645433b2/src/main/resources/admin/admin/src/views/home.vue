<template>
<div class="content" :style='{"padding":"20px 30px 20px","alignItems":"flex-start","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230929/d6f302810f564c39a7299342bf91b11b.png) no-repeat center top / cover","display":"flex","fontSize":"14px","height":"100%"}'>
	<!-- notice -->
	<!-- title -->
	<div class="text" :style='{"margin":"30px auto 40px","color":"rgb(51, 51, 51)","textAlign":"center","display":"none","width":"100%","fontSize":"22px","fontWeight":"500"}'>欢迎使用 {{this.$project.projectName}}</div>
	

	
	<!-- echarts -->
</div>
</template>
<script>
//0
import router from '@/router/router-static'
import * as echarts from 'echarts'
export default {
	data() {
		return {
		};
	},
	mounted(){
		this.init();
	},
	methods:{
		init(){
			if(this.$storage.get('Token')){
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code != 0) {
				router.push({ name: 'login' })
				}
			});
			}else{
				router.push({ name: 'login' })
			}
		},
  }
};
</script>
<style lang="scss" scoped>
    .cardView {
        display: flex;
        flex-wrap: wrap;
        width: 100%;

        .cards {
            display: flex;
            align-items: center;
            width: 100%;
            margin-bottom: 10px;
            justify-content: center;
            .card {
                width: calc(25% - 20px);
                margin: 0 10px;
                /deep/.el-card__body{
                    padding: 0;
                }
            }
        }
    }
	
	// 日历
	.calendar td .text {
				border: 1px solid #f6f6f6;
				border-radius: 0px;
				flex-direction: column;
				color: #999;
				background: rgba(255, 255, 255, .0);
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				height: 100%;
			}
	.calendar td .text:hover {
				background: none;
			}
	.calendar td .text .new {
				color: inherit;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td .text .old {
				color: inherit;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.festival .text {
				border: 1px solid rgba(118, 149, 136, .1);
				border-radius: 0px;
				flex-direction: column;
				color: rgba(118, 149, 136, 1);
				background: rgba(118, 149, 136, .06);
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				height: 100%;
			}
	.calendar td.festival .text:hover {
				background: rgba(118, 149, 136, .06);
			}
	.calendar td.festival .text .new {
				color: inherit;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.festival .text .old {
				color: inherit;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.other .text {
				border-radius: 0px;
				flex-direction: column;
				background: none;
				display: flex;
				width: 100%;
				font-size: inherit;
				justify-content: center;
				align-items: center;
				opacity: 0.6;
				height: 100%;
			}
	.calendar td.other .text:hover {
				background: none;
			}
	.calendar td.other .text .new {
				color: #000;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.other .text .old {
				color: #666;
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.today .text {
				border-radius: 0px;
				flex-direction: column;
				color: #fff;
				background: rgba(118, 149, 136,1);
				display: flex;
				width: 100%;
				justify-content: center;
				align-items: center;
				height: 100%;
			}
	.calendar td.today .text:hover {
				background: rgba(118, 149, 136,1);
			}
	.calendar td.today .text .new {
				font-size: inherit;
				line-height: 1.4;
			}
	.calendar td.today .text .old {
				font-size: inherit;
				line-height: 1.4;
			}
	
	// echarts1
	.type1 .echarts1 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 100%;
				position: relative;
				transition: 0.3s;
				height: 100%;
			}
	.type1 .echarts1:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	// echarts2
	.type2 .echarts1 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				position: relative;
				transition: 0.3s;
				height: 100%;
			}
	.type2 .echarts1:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type2 .echarts2 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				position: relative;
				transition: 0.3s;
				height: 100%;
			}
	.type2 .echarts2:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	// echarts3
	.type3 .echarts1 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0 0 20px;
				color: #333;
				background: rgba(255,255,255,.96);
				width: 100%;
				position: relative;
				transition: 0.3s;
				height: 380px;
			}
	.type3 .echarts1:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type3 .echarts2 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				position: relative;
				transition: 0.3s;
				height: 380px;
			}
	.type3 .echarts2:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	.type3 .echarts3 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				position: relative;
				transition: 0.3s;
				height: 380px;
			}
	.type3 .echarts3:hover {
				transform: translate3d(0, 0px, 0);
				z-index: 1;
			}
	// echarts4
	.type4 .echarts1 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type4 .echarts1:hover {
				transform: translate3d(0, 0px, 0);
			}
	.type4 .echarts2 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type4 .echarts2:hover {
				transform: translate3d(0, 0px, 0);
			}
	.type4 .echarts3 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type4 .echarts3:hover {
				transform: translate3d(0, 0px, 0);
			}
	.type4 .echarts4 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type4 .echarts4:hover {
				transform: translate3d(0, 0px, 0);
			}
	// echarts5
	.type5 .echarts1 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts1:hover {
				transform: translate3d(0, 0px, 0);
			}
	.type5 .echarts2 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts2:hover {
				transform: translate3d(0, 0px, 0);
			}
	.type5 .echarts3 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 100%;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts3:hover {
				transform: translate3d(0, 0px, 0);
			}
	.type5 .echarts4 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts4:hover {
				transform: translate3d(0, 0px, 0);
			}
	.type5 .echarts5 {
				border: 0px solid #eee;
				border-radius: 8px;
				padding: 10px;
				box-shadow: 0 0px 9px rgba(0,0,0,.3);
				margin: 0px 0 20px;
				background: rgba(255,255,255,.96);
				width: 49%;
				position: relative;
				transition: 0.3s;
				height: 360px;
			}
	.type5 .echarts5:hover {
				transform: translate3d(0, 0px, 0);
			}
	
	.echarts-flag-2 {
	  display: flex;
	  flex-wrap: wrap;
	  justify-content: space-between;
	  padding: 10px 20px;
	  background: rebeccapurple;
	
	  &>div {
	    width: 32%;
	    height: 300px;
	    margin: 10px 0;
	    background: rgba(255,255,255,.1);
	    border-radius: 8px;
	    padding: 10px 20px;
	  }
	}
</style>
