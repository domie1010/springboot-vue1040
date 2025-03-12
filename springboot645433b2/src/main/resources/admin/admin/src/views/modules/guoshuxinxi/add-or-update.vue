<template>
	<div class="addEdit-block" :style='{"padding":"30px 0","fontSize":"14px","color":"#999","background":"none"}'>
		<el-form
			:style='{"border":"0px solid rgba(255,255,255,1)","padding":"0px","borderRadius":"4px","alignItems":"flex-start","flexWrap":"wrap","background":"rgba(255,255,255,0)","display":"flex","fontSize":"inherit"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="150px"
		>
			<template >
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="果蔬名称" prop="guoshumingcheng">
					<el-input v-model="ruleForm.guoshumingcheng" placeholder="果蔬名称" clearable  :readonly="ro.guoshumingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="果蔬名称" prop="guoshumingcheng">
					<el-input v-model="ruleForm.guoshumingcheng" placeholder="果蔬名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="select" v-if="type!='info'"  label="果蔬类型" prop="guoshuleixing">
					<el-select :disabled="ro.guoshuleixing" v-model="ruleForm.guoshuleixing" placeholder="请选择果蔬类型" >
						<el-option
							v-for="(item,index) in guoshuleixingOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="果蔬类型" prop="guoshuleixing">
					<el-input v-model="ruleForm.guoshuleixing"
						placeholder="果蔬类型" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="upload" v-if="type!='info' && !ro.guoshutupian" label="果蔬图片" prop="guoshutupian">
					<file-upload
						tip="点击上传果蔬图片"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.guoshutupian?ruleForm.guoshutupian:''"
						@change="guoshutupianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="upload" v-else-if="ruleForm.guoshutupian" label="果蔬图片" prop="guoshutupian">
					<img v-if="ruleForm.guoshutupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.guoshutupian.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.guoshutupian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="select" v-if="type!='info'"  label="生长阶段" prop="shengzhangjieduan">
					<el-select :disabled="ro.shengzhangjieduan" v-model="ruleForm.shengzhangjieduan" placeholder="请选择生长阶段" >
						<el-option
							v-for="(item,index) in shengzhangjieduanOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="生长阶段" prop="shengzhangjieduan">
					<el-input v-model="ruleForm.shengzhangjieduan"
						placeholder="生长阶段" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="种植数量" prop="zhongzhishuliang">
					<el-input v-model.number="ruleForm.zhongzhishuliang" placeholder="种植数量" clearable  :readonly="ro.zhongzhishuliang"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="种植数量" prop="zhongzhishuliang">
					<el-input v-model="ruleForm.zhongzhishuliang" placeholder="种植数量" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="病虫害防治" prop="bingchonghaifangzhi">
					<el-input v-model="ruleForm.bingchonghaifangzhi" placeholder="病虫害防治" clearable  :readonly="ro.bingchonghaifangzhi"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="病虫害防治" prop="bingchonghaifangzhi">
					<el-input v-model="ruleForm.bingchonghaifangzhi" placeholder="病虫害防治" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="施肥" prop="shifei">
					<el-input v-model.number="ruleForm.shifei" placeholder="施肥" clearable  :readonly="ro.shifei"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="施肥" prop="shifei">
					<el-input v-model="ruleForm.shifei" placeholder="施肥" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="灌溉浇水" prop="guangaijiaoshui">
					<el-input v-model.number="ruleForm.guangaijiaoshui" placeholder="灌溉浇水" clearable  :readonly="ro.guangaijiaoshui"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="灌溉浇水" prop="guangaijiaoshui">
					<el-input v-model="ruleForm.guangaijiaoshui" placeholder="灌溉浇水" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="date" v-if="type!='info'" label="播种时间" prop="bozhongshijian">
					<el-date-picker
						value-format="yyyy-MM-dd HH:mm:ss"
						v-model="ruleForm.bozhongshijian" 
						type="datetime"
						:readonly="ro.bozhongshijian"
						placeholder="播种时间"
					></el-date-picker>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-else-if="ruleForm.bozhongshijian" label="播种时间" prop="bozhongshijian">
					<el-input v-model="ruleForm.bozhongshijian" placeholder="播种时间" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="果蔬场地" prop="guoshuchangdi">
					<el-input v-model="ruleForm.guoshuchangdi" placeholder="果蔬场地" clearable  :readonly="ro.guoshuchangdi"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="果蔬场地" prop="guoshuchangdi">
					<el-input v-model="ruleForm.guoshuchangdi" placeholder="果蔬场地" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="运输方式" prop="yunshufangshi">
					<el-input v-model="ruleForm.yunshufangshi" placeholder="运输方式" clearable  :readonly="ro.yunshufangshi"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="运输方式" prop="yunshufangshi">
					<el-input v-model="ruleForm.yunshufangshi" placeholder="运输方式" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="运输时间" prop="yunshushijian">
					<el-input v-model="ruleForm.yunshushijian" placeholder="运输时间" clearable  :readonly="ro.yunshushijian"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="运输时间" prop="yunshushijian">
					<el-input v-model="ruleForm.yunshushijian" placeholder="运输时间" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="date" v-if="type!='info'" label="发布时间" prop="fabushijian">
					<el-date-picker
						value-format="yyyy-MM-dd HH:mm:ss"
						v-model="ruleForm.fabushijian" 
						type="datetime"
						:readonly="ro.fabushijian"
						placeholder="发布时间"
					></el-date-picker>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-else-if="ruleForm.fabushijian" label="发布时间" prop="fabushijian">
					<el-input v-model="ruleForm.fabushijian" placeholder="发布时间" readonly></el-input>
				</el-form-item>
			</template>
			<el-form-item :style='{"padding":"0","margin":"30px 0","alignItems":"center","textAlign":"center","display":"flex","width":"100%","perspective":"320px","-webkitPerspective":"320px","fontSize":"48px","justifyContent":"flex-start"}' class="btn">
				<el-button class="btn3"  v-if="type!='info'" type="success" @click="onSubmit">
					<span class="icon iconfont icon-tijiao16" :style='{"margin":"0 2px","fontSize":"18px","color":"inherit","display":"none"}'></span>
					提交
				</el-button>
				<el-button class="btn4" v-if="type!='info'" type="success" @click="back()">
					<span class="icon iconfont icon-quxiao09" :style='{"margin":"0 2px","fontSize":"18px","color":"inherit","display":"none"}'></span>
					取消
				</el-button>
				<el-button class="btn5" v-if="type=='info'" type="success" @click="back()">
					<span class="icon iconfont icon-fanhui01" :style='{"margin":"0 2px","fontSize":"18px","color":"inherit","display":"none"}'></span>
					返回
				</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
import { 
	isIntNumer,
} from "@/utils/validate";
export default {
	data() {
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				guoshumingcheng : false,
				guoshuleixing : false,
				guoshutupian : false,
				shengzhangjieduan : false,
				zhongzhishuliang : false,
				bingchonghaifangzhi : false,
				shifei : false,
				guangaijiaoshui : false,
				bozhongshijian : false,
				guoshuchangdi : false,
				yunshufangshi : false,
				yunshushijian : false,
				fabushijian : false,
				discussnum : false,
			},
			
			
			ruleForm: {
				guoshumingcheng: '',
				guoshuleixing: '',
				guoshutupian: '',
				shengzhangjieduan: '',
				zhongzhishuliang: '',
				bingchonghaifangzhi: '',
				shifei: '',
				guangaijiaoshui: '',
				bozhongshijian: '',
				guoshuchangdi: '',
				yunshufangshi: '',
				yunshushijian: '',
				fabushijian: '',
			},
		
			guoshuleixingOptions: [],
			shengzhangjieduanOptions: [],

			
			rules: {
				guoshumingcheng: [
				],
				guoshuleixing: [
				],
				guoshutupian: [
				],
				shengzhangjieduan: [
				],
				zhongzhishuliang: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				bingchonghaifangzhi: [
				],
				shifei: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				guangaijiaoshui: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				bozhongshijian: [
				],
				guoshuchangdi: [
				],
				yunshufangshi: [
				],
				yunshushijian: [
				],
				fabushijian: [
				],
				discussnum: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
    components: {
    },
	created() {
		this.ruleForm.bozhongshijian = this.getCurDateTime()
		this.ruleForm.fabushijian = this.getCurDateTime()
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='guoshumingcheng'){
							this.ruleForm.guoshumingcheng = obj[o];
							this.ro.guoshumingcheng = true;
							continue;
						}
						if(o=='guoshuleixing'){
							this.ruleForm.guoshuleixing = obj[o];
							this.ro.guoshuleixing = true;
							continue;
						}
						if(o=='guoshutupian'){
							this.ruleForm.guoshutupian = obj[o];
							this.ro.guoshutupian = true;
							continue;
						}
						if(o=='shengzhangjieduan'){
							this.ruleForm.shengzhangjieduan = obj[o];
							this.ro.shengzhangjieduan = true;
							continue;
						}
						if(o=='zhongzhishuliang'){
							this.ruleForm.zhongzhishuliang = obj[o];
							this.ro.zhongzhishuliang = true;
							continue;
						}
						if(o=='bingchonghaifangzhi'){
							this.ruleForm.bingchonghaifangzhi = obj[o];
							this.ro.bingchonghaifangzhi = true;
							continue;
						}
						if(o=='shifei'){
							this.ruleForm.shifei = obj[o];
							this.ro.shifei = true;
							continue;
						}
						if(o=='guangaijiaoshui'){
							this.ruleForm.guangaijiaoshui = obj[o];
							this.ro.guangaijiaoshui = true;
							continue;
						}
						if(o=='bozhongshijian'){
							this.ruleForm.bozhongshijian = obj[o];
							this.ro.bozhongshijian = true;
							continue;
						}
						if(o=='guoshuchangdi'){
							this.ruleForm.guoshuchangdi = obj[o];
							this.ro.guoshuchangdi = true;
							continue;
						}
						if(o=='yunshufangshi'){
							this.ruleForm.yunshufangshi = obj[o];
							this.ro.yunshufangshi = true;
							continue;
						}
						if(o=='yunshushijian'){
							this.ruleForm.yunshushijian = obj[o];
							this.ro.yunshushijian = true;
							continue;
						}
						if(o=='fabushijian'){
							this.ruleForm.fabushijian = obj[o];
							this.ro.fabushijian = true;
							continue;
						}
						if(o=='discussnum'){
							this.ruleForm.discussnum = obj[o];
							this.ro.discussnum = true;
							continue;
						}
				}
			}
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					var json = data.data;
				} else {
					this.$message.error(data.msg);
				}
			});
            this.$http({
				url: `option/guoshuleixing/guoshuleixing`,
				method: "get"
            }).then(({ data }) => {
				if (data && data.code === 0) {
					this.guoshuleixingOptions = data.data;
				} else {
					this.$message.error(data.msg);
				}
            });
            this.shengzhangjieduanOptions = "苗期,生长期,开花期,结果期".split(',')
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `guoshuxinxi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {
	if(this.ruleForm.guoshutupian!=null) {
		this.ruleForm.guoshutupian = this.ruleForm.guoshutupian.replace(new RegExp(this.$base.url,"g"),"");
	}
var objcross = this.$storage.getObj('crossObj');
      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
		this.$refs["ruleForm"].validate(valid => {
			if (valid) {
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid = crossuserid;
					this.ruleForm.crossrefid = crossrefid;
					let params = { 
						page: 1, 
						limit: 10, 
						crossuserid:this.ruleForm.crossuserid,
						crossrefid:this.ruleForm.crossrefid,
					} 
				this.$http({ 
					url: "guoshuxinxi/page", 
					method: "get", 
					params: params 
				}).then(({ 
					data 
				}) => { 
					if (data && data.code === 0) { 
						if(data.data.total>=crossoptnum) {
							this.$message.error(this.$storage.get('tips'));
							return false;
						} else {
							this.$http({
								url: `guoshuxinxi/${!this.ruleForm.id ? "save" : "update"}`,
								method: "post",
								data: this.ruleForm
							}).then(({ data }) => {
								if (data && data.code === 0) {
									this.$message({
										message: "操作成功",
										type: "success",
										duration: 1500,
										onClose: () => {
											this.parent.showFlag = true;
											this.parent.addOrUpdateFlag = false;
											this.parent.guoshuxinxiCrossAddOrUpdateFlag = false;
											this.parent.search();
											this.parent.contentStyleChange();
										}
									});
								} else {
									this.$message.error(data.msg);
								}
							});

						}
					} else { 
				} 
			});
		} else {
			this.$http({
				url: `guoshuxinxi/${!this.ruleForm.id ? "save" : "update"}`,
				method: "post",
			   data: this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "操作成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.parent.showFlag = true;
							this.parent.addOrUpdateFlag = false;
							this.parent.guoshuxinxiCrossAddOrUpdateFlag = false;
							this.parent.search();
							this.parent.contentStyleChange();
						}
					});
				} else {
					this.$message.error(data.msg);
			   }
			});
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.guoshuxinxiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    guoshutupianUploadChange(fileUrls) {
	    this.ruleForm.guoshutupian = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: #769589;
	  	  font-weight: 500;
	  	  display: inline-block;
	  	  width: 150px;
	  	  font-size: inherit;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 150px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 2px solid #374f45;
	  	  border-radius: 0px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: none;
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-width: 750px;
	  	  height: 36px;
	  	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  	  border: 2px solid #374f45;
	  	  border-radius: 0px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: none;
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-width: 750px;
	  	  height: 36px;
	  	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 2px solid #374f45;
	  	  border-radius: 0px;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: none;
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-width: 750px;
	  	  height: 36px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 2px solid #374f45;
	  	  border-radius: 0px;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: none;
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-width: 750px;
	  	  height: 36px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 2px solid #374f45;
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: #cbcbcb;
	  	  background: none;
	  	  font-weight: 600;
	  	  object-fit: cover;
	  	  width: 260px;
	  	  font-size: 42px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 2px solid #374f45;
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: #cbcbcb;
	  	  background: none;
	  	  font-weight: 600;
	  	  object-fit: cover;
	  	  width: 260px;
	  	  font-size: 42px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 2px solid #374f45;
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: #cbcbcb;
	  	  background: none;
	  	  font-weight: 600;
	  	  object-fit: cover;
	  	  width: 260px;
	  	  font-size: 42px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 2px solid #374f45;
	  	  border-radius: 0px;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: none;
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-width: 750px;
	  	  height: 120px;
	  	}
	
	.add-update-preview .btn .btn1 {
				border: 0px solid rgba(126, 96, 16, .2);
				cursor: pointer;
				padding: 0 30px;
				margin: 0px 20px 0 0;
				color: #fff;
				display: inline-block;
				font-size: 14px;
				line-height: 24px;
				border-radius: 0px;
				outline: none;
				background: #374f45;
				width: auto;
				min-width: 120px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn1:hover {
				transform: scale(0.9) skew(-10deg, 10deg);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn2 {
				border: 0px solid rgba(126, 96, 16, .2);
				cursor: pointer;
				padding: 0 30px;
				margin: 0px 20px 0 0;
				color: #fff;
				font-size: 14px;
				line-height: 24px;
				border-radius: 0px;
				outline: none;
				background: #374f45;
				width: auto;
				min-width: 120px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn2:hover {
				transform: scale(0.9) skew(-10deg, 10deg);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn3 {
				border: 0px solid rgba(126, 96, 16, .2);
				cursor: pointer;
				padding: 0 30px;
				margin: 0px 20px 0 0;
				color: #fff;
				font-size: 16px;
				line-height: 24px;
				border-radius: 0px;
				outline: none;
				background: #374f45;
				width: auto;
				min-width: 120px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn3:hover {
				transform: scale(0.9) skew(-10deg, 10deg);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn4 {
				border: 0px solid rgba(126, 96, 16, .2);
				cursor: pointer;
				padding: 0 30px;
				margin: 0px 20px 0 0;
				color: #fff;
				font-size: 16px;
				line-height: 24px;
				border-radius: 0px;
				outline: none;
				background: #374f45;
				width: auto;
				min-width: 120px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn4:hover {
				transform: scale(0.9) skew(-10deg, 10deg);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn5 {
				border: 0px solid rgba(126, 96, 16, .2);
				cursor: pointer;
				padding: 0 30px;
				margin: 0px 20px 0 0;
				color: #fff;
				font-size: 16px;
				line-height: 24px;
				border-radius: 0px;
				outline: none;
				background: #374f45;
				width: auto;
				min-width: 120px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn5:hover {
				transform: scale(0.9) skew(-10deg, 10deg);
				opacity: 0.8;
			}
</style>
